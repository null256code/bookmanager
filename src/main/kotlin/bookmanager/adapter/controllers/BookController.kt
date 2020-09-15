package bookmanager.adapter.controllers

import bookmanager.adapter.requests.CreateBookRequest
import bookmanager.adapter.requests.GetBookByIdRequest
import bookmanager.adapter.responses.Response
import bookmanager.application.usecases.CreateBookUseCase
import bookmanager.application.usecases.GetBookByIdUseCase

import io.micronaut.http.MediaType
import io.micronaut.http.MutableHttpResponse
import io.micronaut.http.annotation.*

@Controller("/book")
class BookController(
        private val getBookByIdUseCase: GetBookByIdUseCase,
        private val createBookUseCase: CreateBookUseCase

) {

    @Get("find/{id}", produces = [MediaType.APPLICATION_JSON])
    fun get(@PathVariable id: Long): MutableHttpResponse<Response> {
        return getBookByIdUseCase.handle(GetBookByIdRequest(id))
    }

    @Post("create", produces = [MediaType.APPLICATION_JSON])
    fun create(@Body request: CreateBookRequest): MutableHttpResponse<Response> {
        println("create")
        return createBookUseCase.handle(request)
    }
}