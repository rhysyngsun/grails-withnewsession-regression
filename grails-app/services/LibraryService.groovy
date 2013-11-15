

import grails.transaction.Transactional

@Transactional
class LibraryService {

    def countByName(String name) {
        Library.countByName(name)
    }
}
