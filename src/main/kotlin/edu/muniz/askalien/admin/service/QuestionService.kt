package edu.muniz.askalien.admin.service

import edu.muniz.askalien.admin.domain.Question
import edu.muniz.askalien.admin.repository.QuestionFilter
import edu.muniz.askalien.admin.repository.QuestionRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
class QuestionService {

    @Autowired
    lateinit var  questionRepo: QuestionRepository

    fun getQuestions(filter: QuestionFilter): Flux<Question> {
        return questionRepo.findAll(filter)
    }

}