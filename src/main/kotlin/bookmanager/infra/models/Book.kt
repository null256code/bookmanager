package bookmanager.infra.models

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Book(
        @Id @GeneratedValue
        var id: Long,
        var title: String
){
        constructor(): this(0, "")
}