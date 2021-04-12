package edu.muniz.askalien.admin

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AnswerController {

    @Autowired
    lateinit var service: AnswerService

    @GetMapping("/admin/answers")
    suspend fun getAnswers(): List<Answer> {
        return service.getAnswers()
    }

}