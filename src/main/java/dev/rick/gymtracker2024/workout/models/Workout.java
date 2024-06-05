package dev.rick.gymtracker2024.workout.models;

import dev.rick.gymtracker2024.enums.WorkoutStatus;
import dev.rick.gymtracker2024.exercise.Exercise;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@PrimaryKeyJoinColumn(name = "workoutId")
@Table(name = "workouts")
@Getter
@Setter
public class Workout extends Exercise {

    @Embedded
    private WorkoutSet workoutSet;

    private String comment;

    private WorkoutStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinTable(
            name = "day_workouts",
            joinColumns = @JoinColumn(name = "day_id"))
    private WorkoutDay workoutDay;
}
