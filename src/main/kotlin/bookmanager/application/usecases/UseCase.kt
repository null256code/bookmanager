package bookmanager.application.usecases

import bookmanager.adapter.requests.Request
import bookmanager.adapter.responses.Response
import io.micronaut.http.MutableHttpResponse

interface UseCase<in T : Request> {
    fun handle(request: T): MutableHttpResponse<Response>
}