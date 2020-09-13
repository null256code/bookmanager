package bookmanager.adapter.controllers

import bookmanager.adapter.requests.GetBookByIdRequest
import bookmanager.adapter.responses.GetBookByIdResponse
import bookmanager.adapter.responses.Response
import bookmanager.application.usecases.GetBookByIdUseCase
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus

import io.micronaut.http.MediaType
import io.micronaut.http.MutableHttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable

@Controller("/book")
class BookController(private val getBookByIdUseCase: GetBookByIdUseCase) {

    @Get("find/{id}", produces = [MediaType.APPLICATION_JSON])
    fun get(@PathVariable id: Long): MutableHttpResponse<Response>? {
        // TODO: この部分、UseCaseに
        val response = getBookByIdUseCase.handle(GetBookByIdRequest(id))
        return HttpResponse.status<GetBookByIdResponse>(HttpStatus.OK).body(response)
    }

    @Get("create", produces = [MediaType.TEXT_PLAIN])
    fun index(): String {
        return "create"
    }
}