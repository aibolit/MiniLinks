package minilinks

class LController {

    def index() { }

    def create() { 
        println params
        redirect action: 'index'
    }

    def follow() { 
        println params
        redirect action: 'index'
     }
}
