package org.vivek.quizservicems.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.vivek.quizservicems.model.Quiz;


public interface QuizRepo extends JpaRepository<Quiz,Integer> {
}
