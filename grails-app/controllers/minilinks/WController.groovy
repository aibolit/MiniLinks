package minilinks

class WController {

    def index() { 
        def url = Link.findByAlias(params.alias)?.url
        if(url) {
            redirect url: url
        } else {
            render status: 404
        }
    }
}
