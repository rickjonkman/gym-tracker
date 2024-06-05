package dev.rick.gymtracker2024.workout.models;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class WorkoutSet {

    private int sets;
    private int reps;
    private double weight;

}
