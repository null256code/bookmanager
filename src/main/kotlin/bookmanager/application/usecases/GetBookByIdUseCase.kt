package bookmanager.application.usecases

import bookmanager.adapter.requests.GetBookByIdRequest
import bookmanager.adapter.responses.GetBookByIdResponse
import bookmanager.adapter.responses.Response
import bookmanager.domain.models.BookRepository
import javax.inject.Singleton

@Singleton
class GetBookByIdUseCase(private val bookRepository: BookRepository) : UseCase<GetBookByIdRequest> {

    override fun handle(request: GetBookByIdRequest): Response {
        val book = bookRepository.find(request.bookId)
        return GetBookByIdResponse(
                book?.id?: 0,
                book?.title?: ""
        )
    }
}