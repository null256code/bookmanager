package bookmanager.infra.dtos

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "book_publisher")
data class BookPublisherDTO(
        @Id @GeneratedValue
        var bookPublisherId: Long,
        var bookId: Long,
        var publisherId: Long
)