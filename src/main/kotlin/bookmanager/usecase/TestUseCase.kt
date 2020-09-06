package bookmanager.usecase

import bookmanager.infra.TestRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TestUseCase {
    @Inject
    lateinit var testRepository: TestRepository
    fun handle() {
        // val test = testRepository.find("test")
        val test = testRepository.findById(1)
        println("UseCase")
    }
}