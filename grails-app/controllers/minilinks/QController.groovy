package minilinks

class QController {

    def index() { 
        render view: '/q/index'
    }
    def hmmm() {
        if (grailsApplication.config.minilinks.hmmm == params.hmmm) {
            session.hmmm = true
            redirect controller: 'l'
        } else {
            render view: '/q/index'
        }
    }
}
