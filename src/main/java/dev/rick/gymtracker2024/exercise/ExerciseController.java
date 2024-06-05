package dev.rick.gymtracker2024.exercise;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exercises")
@AllArgsConstructor
public class ExerciseController {

    private final ExerciseService exerciseService;


}
