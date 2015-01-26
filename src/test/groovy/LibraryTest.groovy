import spock.lang.Specification

class LibraryTest extends Specification{
    def "someLibraryMethod returns true"() {
        setup:
        Library lib = new Library()
        println "***************************************"
        when:
        def result = lib.someLibraryMethod()
        then:
        result == false
    }
}
