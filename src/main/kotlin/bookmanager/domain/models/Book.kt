package bookmanager.domain.models

class Book(
        var id: Long,
        var title: String) {

}

interface BookRepository {
    fun find(id: Long): Book?
    fun save(book: Book)
}