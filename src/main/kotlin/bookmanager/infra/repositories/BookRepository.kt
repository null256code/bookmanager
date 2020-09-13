package bookmanager.infra.repositories

import bookmanager.domain.models.Book
import bookmanager.domain.models.BookRepository
import bookmanager.infra.daos.BookDAO
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class BookRepositoryImpl : BookRepository {
    @Inject
    lateinit var bookDAO: BookDAO

    override fun find(id: Long): Book? {
        val b = bookDAO.findById(id)
        return b.map { b -> Book(b.bookId, b.title) }.orElse(null)
    }

    override fun save(book: Book) {
        TODO("Not yet implemented")
    }


}