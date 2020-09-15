package bookmanager.infra.daos

import bookmanager.infra.dtos.PublisherDTO
import io.micronaut.data.annotation.Query
import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository

@Repository
interface PublisherDAO : CrudRepository<PublisherDTO, Long> {
    @Query(value = """select
    pu
from
    PublisherDTO pu
    inner join BookPublisherDTO bp on bp.publisherId = pu.publisherId
where
    bp.bookId = :bookId""")
    fun findByBookId(bookId: Long): List<PublisherDTO>
}