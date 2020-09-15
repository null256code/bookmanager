package bookmanager.infra.repositories

import bookmanager.domain.models.Publisher
import bookmanager.domain.models.PublisherRepository
import bookmanager.infra.daos.PublisherDAO
import javax.inject.Inject

class PublisherRepositoryImpl : PublisherRepository {
    @Inject
    lateinit var publisherDAO: PublisherDAO
    override fun find(id: Long): Publisher? {
        val p = publisherDAO.findById(id)
        return p.map { p -> Publisher(p.publisherId, p.name) }.orElse(null)
    }

    override fun save(publisher: Publisher) {
        TODO("Not yet implemented")
    }
}