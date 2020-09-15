package bookmanager.adapter.responses

data class GetBookByIdResponse(
        val bookId: Long,
        val title: String,
        val publishers: List<String>,
        val authors: List<String>
) : Response