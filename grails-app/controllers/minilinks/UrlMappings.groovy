package minilinks

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
        "/$alias"(controller: 'w') {}

        "/"(controller:"l")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
