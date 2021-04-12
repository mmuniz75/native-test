package edu.muniz.askalien.admin

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
class AnswerService {

    @Autowired
    lateinit var repo: AnswerRepository

    suspend fun getAnswers(): List<Answer> {
        return repo.findAllSummary()
    }

}