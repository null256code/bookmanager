package bookmanager.application.usecases

import bookmanager.adapter.requests.GetBookByIdRequest
import bookmanager.adapter.responses.GetBookByIdResponse
import bookmanager.adapter.responses.Response
import bookmanager.domain.models.BookRepository
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.MutableHttpResponse
import javax.inject.Singleton

@Singleton
class GetBookByIdUseCase(private val bookRepository: BookRepository) : UseCase<GetBookByIdRequest> {

    override fun handle(request: GetBookByIdRequest): MutableHttpResponse<Response> {
        val book = bookRepository.find(request.bookId)
        val response = GetBookByIdResponse(
                book?.id ?: 0,
                book?.title ?: "",
                book?.publishers?.map { p -> p.name } ?: emptyList(),
                book?.authors?.map { a -> a.name } ?: emptyList()
        )
        return HttpResponse.status<GetBookByIdResponse>(HttpStatus.OK).body(response)
    }
}