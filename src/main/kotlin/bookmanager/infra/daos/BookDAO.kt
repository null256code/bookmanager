package bookmanager.infra.daos

import bookmanager.infra.dtos.BookDTO
import io.micronaut.data.annotation.Query
import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository

@Repository
interface BookDAO : CrudRepository<BookDTO, Long> {
    @Query(value = """select
    bo.book_id, bo.title as book_title,
    pu.publisher_id, pu.name as publisher_name,
    au.author_id, au.name as author_name
from
    book bo
    inner join book_publisher bp on bo.book_id = bp.book_id
    inner join publisher pu on pu.publisher_id = bp.publisher_id
    inner join book_author ba on ba.book_id = bo.book_id
    inner join author au on au.author_id = ba.author_id
where
    bo.book_id = :bookId""", nativeQuery = true)
    fun findBookAndPublisherAndAuthorByBookId(bookId: Long): List<FindBookAndPublisherAndAuthorByBookIdDTO>
}

data class FindBookAndPublisherAndAuthorByBookIdDTO(
        var bookId: Long,
        var bookTitle: String,
        var publisherId: Long,
        var publisherName: String,
        var authorId: Long,
        var authorName: String
)