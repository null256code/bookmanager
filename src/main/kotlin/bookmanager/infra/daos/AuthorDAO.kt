package bookmanager.infra.daos

import bookmanager.infra.dtos.AuthorDTO
import io.micronaut.data.annotation.Query
import io.micronaut.data.annotation.Repository

@Repository
interface AuthorDAO {
    @Query(value = """select
    au
from
    AuthorDTO au
    inner join BookAuthorDTO ba on ba.authorId = au.authorId
where
    ba.bookId = :bookId""")
    fun findByBookId(bookId: Long): List<AuthorDTO>
}