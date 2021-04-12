package edu.muniz.askalien.admin

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
class AnswerService {

    @Autowired
    lateinit var repo: AnswerRepository

    fun getAnswers(): Flux<Answer> {
        return repo.findAllSummary()
    }

}