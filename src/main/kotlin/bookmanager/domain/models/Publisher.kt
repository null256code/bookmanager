package bookmanager.domain.models

class Publisher(
        val id: Long,
        val name: String
){}

interface PublisherRepository {
    fun find(id: Long): Publisher?
    fun save(publisher: Publisher)
}