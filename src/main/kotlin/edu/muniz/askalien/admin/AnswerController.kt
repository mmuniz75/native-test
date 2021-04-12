package edu.muniz.askalien.admin

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
class AnswerController {

    @Autowired
    lateinit var service: AnswerService

    @GetMapping("/admin/answers")
    fun getAnswers(): Flux<Answer> {
        return service.getAnswers()
    }

}