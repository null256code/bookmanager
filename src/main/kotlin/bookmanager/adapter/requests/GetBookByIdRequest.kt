package bookmanager.adapter.requests

data class GetBookByIdRequest(
        val bookId: Long
) : Request