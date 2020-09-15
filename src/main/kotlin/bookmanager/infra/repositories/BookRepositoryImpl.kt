package bookmanager.infra.repositories

import bookmanager.domain.models.Author
import bookmanager.domain.models.Book
import bookmanager.domain.models.BookRepository
import bookmanager.domain.models.Publisher
import bookmanager.infra.daos.AuthorDAO
import bookmanager.infra.daos.BookDAO
import bookmanager.infra.daos.PublisherDAO
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class BookRepositoryImpl : BookRepository {
    @Inject
    lateinit var bookDAO: BookDAO
    @Inject
    lateinit var publisherDAO: PublisherDAO
    @Inject
    lateinit var authorDAO: AuthorDAO

    override fun find(id: Long): Book? {
        val b = bookDAO.findById(id)
        val publishers = publisherDAO.findByBookId(id).map { p -> Publisher(p.publisherId, p.name) }
        val authors = authorDAO.findByBookId(id).map { a -> Author(a.authorId, a.name) }
        return b.map { b -> Book(b.bookId, b.title, publishers, authors) }.orElse(null)
    }

    override fun save(book: Book) {
        TODO("Not yet implemented")
    }


}