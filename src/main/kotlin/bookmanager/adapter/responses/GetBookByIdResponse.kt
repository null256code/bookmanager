package bookmanager.adapter.responses

data class GetBookByIdResponse(
        val bookId: Long,
        val title: String
) : Response