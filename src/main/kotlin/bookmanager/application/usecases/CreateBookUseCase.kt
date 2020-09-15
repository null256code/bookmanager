package bookmanager.application.usecases

import bookmanager.adapter.requests.CreateBookRequest
import bookmanager.adapter.responses.GetBookByIdResponse
import bookmanager.adapter.responses.Response
import bookmanager.domain.models.Book
import bookmanager.domain.models.BookRepository
import bookmanager.domain.models.PublisherRepository
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.MutableHttpResponse
import javax.inject.Singleton

@Singleton
class CreateBookUseCase(
        private val publisherRepository: PublisherRepository,
        private val bookRepository: BookRepository) : UseCase<CreateBookRequest> {
    override fun handle(request: CreateBookRequest): MutableHttpResponse<Response> {
        val publisher = publisherRepository.find(request.publisherId)
                ?: return HttpResponse.status(HttpStatus.BAD_REQUEST)
        val book = Book(request.bookTitle, listOf(publisher), emptyList())
        return HttpResponse.status(HttpStatus.OK)
        TODO("Not yet implemented")
    }
}