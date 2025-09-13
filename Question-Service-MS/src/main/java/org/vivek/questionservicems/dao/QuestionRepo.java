package org.vivek.questionservicems.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.vivek.questionservicems.model.Question;


import java.util.List;

public interface QuestionRepo extends JpaRepository<Question,Integer> {
    List<Question> findAllByCategory(String category);

    @Query(value = "SELECT * FROM question q Where q.category=:category ORDER BY RANDOM() LIMIT :numQ", nativeQuery = true)
    List<Integer> findRandomQuestionsByCategory(String category, int numQ);
}
