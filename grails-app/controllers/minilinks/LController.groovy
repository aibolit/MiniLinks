package minilinks

class LController {

    def index() { }

    def create() {
        def alias = params.alias ?: params.placeholder
        def url = params.url

        def link = Link.findByAlias(alias) 
        if (link) {
            if (!params.update) {
                flash.color = "red"
                flash.message = "A link already exists for this alias."
            } else {
                link.url = url
                link.save(flush: true)
                flash.color = "green"
                flash.message = "Created"
                flash.alias = alias
            }
        } else {
            link = new Link(url: url, alias: alias)
            link.save(flush: true)

            flash.color = "green"
            flash.message = "Created"
            flash.alias = alias
        }

        println flash
        forward action: 'index'
    }
}
