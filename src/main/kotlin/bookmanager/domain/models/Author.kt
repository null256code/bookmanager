package bookmanager.domain.models

class Author(
        val id: Long,
        val name: String
) {
}

interface AuthorRepository {
    fun find(id: Long): Author?
    fun save(book: Author)
}