package com.example.demo.controller;

import com.example.demo.model.QuizQuestion;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/quiz")
public class QuizController {

    @GetMapping("/questions")
    public List<QuizQuestion> getQuizQuestions() {
        List<QuizQuestion> quizQuestions = new ArrayList<>();

        quizQuestions.add(new QuizQuestion(
                "Who is the Legendary Super Saiyan",
                new String[]{"Bardock", "Broly", "Goku", "Trunks"},
                "Bardock"));

        quizQuestions.add(new QuizQuestion(
                "In which movie did we first see Gogeta",
                new String[]{"Broly: Second Coming", "Fusion Reborn", "The Return of Cooler", "Battle of Gods"},
                "Fusion Reborn"));

        quizQuestions.add(new QuizQuestion(
                "Who was Goku's main rival in the original Dragon Ball Series",
                new String[]{"Piccolo", "Vegeta", "Krillin", "Yamcha"},
                "Piccolo"));

        quizQuestions.add(new QuizQuestion(
                "What technique did Goku learn from King Kai",
                new String[]{"Destroucto Disc", "Instant Transmission", "Kamehameha", "Kaio-ken"},
                "Kaio-ken"));

        quizQuestions.add(new QuizQuestion(
                "Why did vegeta shave his mustache",
                new String[]{"it made him look like a total geek", "it was not the saiyan way", "to get ssj 4", "Piccolo"},
                "it made him look like a total geek"));

        return quizQuestions;
    }
}
