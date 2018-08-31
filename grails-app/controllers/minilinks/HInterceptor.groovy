package minilinks


class HInterceptor {

    int order = 1

    boolean before() { true }

    boolean after() { true }

    void afterView() {
        // no-op
    }
}
