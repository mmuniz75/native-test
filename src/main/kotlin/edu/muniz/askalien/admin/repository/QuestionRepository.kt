package edu.muniz.askalien.admin.repository

import edu.muniz.askalien.admin.domain.Question
import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface QuestionRepository : ReactiveCrudRepository<Question, Integer>,QuestionCustomizedRepository{


}