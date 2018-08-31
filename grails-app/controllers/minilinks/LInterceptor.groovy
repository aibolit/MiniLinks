package minilinks


class LInterceptor {

    int order = 2

    boolean before() {
        if (session.hmmm) return true

        redirect controller: 'q'
        false 
    }

    boolean after() { true }

    void afterView() {
        // no-op
    }
}
