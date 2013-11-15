import grails.test.spock.IntegrationSpec
import spock.lang.Unroll
/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
class BookIntegrationSpec extends IntegrationSpec {

    Library library

    def setup() {
        // withNewSession seems to mess with the test's transaction
        Library.withNewSession {
            library = new Library(name: "Local Library").save(flush: true)
        }
    }

    def "test adding books to a library"() {
        when:
        def book = new Book(name: "First book")
        book.library = library
        book.save(flush: true)

        then:
        book.id != null
    }
}
