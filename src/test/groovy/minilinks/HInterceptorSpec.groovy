package minilinks

import grails.testing.web.interceptor.InterceptorUnitTest
import spock.lang.Specification

class HInterceptorSpec extends Specification implements InterceptorUnitTest<HInterceptor> {

    def setup() {
    }

    def cleanup() {

    }

    void "Test h interceptor matching"() {
        when:"A request matches the interceptor"
            withRequest(controller:"h")

        then:"The interceptor does match"
            interceptor.doesMatch()
    }
}
