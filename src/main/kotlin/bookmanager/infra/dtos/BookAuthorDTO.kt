package bookmanager.infra.dtos

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "book_author")
data class BookAuthorDTO(
        @Id @GeneratedValue
        var bookAuthorId: Long,
        var bookId: Long,
        var authorId: Long

)