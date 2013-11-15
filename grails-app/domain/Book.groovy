
class Book {
    String name
    
    Library library

    static constraints = {
      name(unique: true)
    }
}
