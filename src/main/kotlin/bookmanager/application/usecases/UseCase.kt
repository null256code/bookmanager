package bookmanager.application.usecases

import bookmanager.adapter.requests.Request
import bookmanager.adapter.responses.Response

interface UseCase<in T : Request> {
    fun handle(request: T): Response
}