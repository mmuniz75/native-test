package edu.muniz.askalien.admin

import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import reactor.core.publisher.Flux

interface AnswerRepository : ReactiveCrudRepository<Answer, Int> {

    @Query("select * from Answer answer order by id desc ")
    fun findAllSummary(): Flux<Answer>


}