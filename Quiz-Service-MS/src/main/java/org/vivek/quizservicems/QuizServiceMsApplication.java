package org.vivek.quizservicems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class QuizServiceMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuizServiceMsApplication.class, args);
    }

}
