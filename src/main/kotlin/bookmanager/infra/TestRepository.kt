package bookmanager.infra

import bookmanager.infra.models.Book
import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository

@Repository
abstract class TestRepository : CrudRepository<Book, Long> {

}