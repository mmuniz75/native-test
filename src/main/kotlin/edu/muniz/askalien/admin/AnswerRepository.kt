package edu.muniz.askalien.admin

import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface AnswerRepository : ReactiveCrudRepository<Answer, Int> {

    @Query("select * from Answer answer order by id desc ")
    suspend fun findAllSummary(): List<Answer>


}