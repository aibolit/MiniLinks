package minilinks


class HInterceptor {

    public HInterceptor() {
        match controller: 'l' match controller: 'q'
    }

    final private String HTTP_PROTOCOL = 'http://'
    int order = 1

    boolean before() { 
        if (!request.isSecure && grailsApplication.config.minilinks.useSSL) {
            def url = request.requestURL
            if (url.substring(0, HTTP_PROTOCOL.length()) == HTTP_PROTOCOL) {
                println "rerouting ssl ${request.isSecure} ${request.requestURL}"
                redirect url: "https://${url.substring(HTTP_PROTOCOL.length())}"
                return false
            }
        }
        true
    }

    boolean after() { true }

    void afterView() {
        // no-op
    }
}
