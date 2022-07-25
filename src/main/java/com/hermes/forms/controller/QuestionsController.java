package com.hermes.forms.controller;

import com.hermes.forms.domain.Question;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionsController {
    @GetMapping
    List<Question> getQuestions() {
        // TODO: Implement this and remove the next line
        return new ArrayList<>();
    }
}
