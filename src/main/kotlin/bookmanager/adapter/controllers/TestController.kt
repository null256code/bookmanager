package bookmanager.adapter.controllers

import bookmanager.usecase.TestUseCase
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/hello")
class TestController(private val testUseCase: TestUseCase) {

    @Get(produces = [MediaType.TEXT_PLAIN])
    fun index(): String {
        testUseCase.handle()
        return "hello world"
    }
}