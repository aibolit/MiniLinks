package minilinks


class LInterceptor {

    order = 2

    boolean before() { 
        if (session.isAdmin) return true

        redirect controller: 'q'
        false 
    }

    boolean after() { true }

    void afterView() {
        // no-op
    }
}
