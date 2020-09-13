package bookmanager.infra.dtos

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "publisher")
data class PublisherDTO(
        @Id @GeneratedValue
        var publisherId: Long,
        var name: String
)