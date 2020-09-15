package bookmanager.adapter.requests

import com.fasterxml.jackson.annotation.JsonProperty
import io.micronaut.core.annotation.Introspected

@Introspected
data class CreateBookRequest(
        @JsonProperty("publisher_id") val publisherId: Long,
        @JsonProperty("author_id") val authorId: Long,
        @JsonProperty("book_title") val bookTitle: String
) : Request