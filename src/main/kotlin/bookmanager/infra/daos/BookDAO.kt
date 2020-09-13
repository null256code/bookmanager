package bookmanager.infra.daos

import bookmanager.infra.dtos.BookDTO
import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository

@Repository
abstract class BookDAO : CrudRepository<BookDTO, Long> {
}