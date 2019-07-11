package minilinks

class LController {

    def index() {
        render view: '/l/index'
    }

    def create() {
        def override = params.create == "Override"
        def alias = override ? params.overrideAlias : params.alias ?: params.placeholder
        def link = Link.findByAlias(alias)
        if (link) {
            if (!override) {
                flash.color = "red"
                flash.message = "A link already exists for this alias."
                flash.type = "EXISTS"
                flash.alias = alias
                flash.url = params.url
            } else {
                link.url = params.overrideUrl
                link.save(flush: true)
                flash.color = "green"
                flash.message = "Created"
                flash.alias = alias
            }
        } else {
            link = new Link(url: params.url, alias: alias)
            link.save(flush: true)

            flash.color = "green"
            flash.message = "Created"
            flash.alias = alias
        }

        forward action: 'index'
    }
}
