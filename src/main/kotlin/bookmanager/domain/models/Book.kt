package bookmanager.domain.models

class Book(
        var id: Long,
        var title: String,
        var publishers: List<Publisher>,
        var authors: List<Author>
) {
    constructor(title: String, publishers: List<Publisher>, authors: List<Author>) : this(-1, title, publishers, authors)
}

interface BookRepository {
    fun find(id: Long): Book?
    fun save(book: Book)
}