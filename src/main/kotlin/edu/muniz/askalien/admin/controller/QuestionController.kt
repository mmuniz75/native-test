package edu.muniz.askalien.admin.controller

import edu.muniz.askalien.admin.domain.Question
import edu.muniz.askalien.admin.repository.QuestionFilter
import edu.muniz.askalien.admin.service.QuestionService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
@RequestMapping("/admin")
class QuestionController {

    @Autowired
    lateinit var service: QuestionService

    @PostMapping("/questions")
    fun getQuestions(@RequestBody filter: QuestionFilter): Flux<Question> {
        return service.getQuestions(filter)
    }

}