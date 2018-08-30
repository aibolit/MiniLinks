package minilinks


class HInterceptor {

    order = 1

    boolean before() { true }

    boolean after() { true }

    void afterView() {
        // no-op
    }
}
