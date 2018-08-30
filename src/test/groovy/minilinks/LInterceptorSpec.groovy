package minilinks

import grails.testing.web.interceptor.InterceptorUnitTest
import spock.lang.Specification

class LInterceptorSpec extends Specification implements InterceptorUnitTest<LInterceptor> {

    def setup() {
    }

    def cleanup() {

    }

    void "Test l interceptor matching"() {
        when:"A request matches the interceptor"
            withRequest(controller:"l")

        then:"The interceptor does match"
            interceptor.doesMatch()
    }
}
