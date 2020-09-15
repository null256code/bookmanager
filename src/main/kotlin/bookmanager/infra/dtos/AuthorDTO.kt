package bookmanager.infra.dtos

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "author")
data class AuthorDTO(
        @Id @GeneratedValue
        var authorId: Long,
        var name: String
) {
    constructor() : this(0, "")
}