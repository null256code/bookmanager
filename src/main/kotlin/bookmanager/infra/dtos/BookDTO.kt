package bookmanager.infra.dtos

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "book")
data class BookDTO(
        @Id @GeneratedValue
        var bookId: Long,
        var title: String
){
    constructor(): this(0, "")
}