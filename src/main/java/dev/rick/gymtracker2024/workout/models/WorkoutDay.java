package dev.rick.gymtracker2024.workout.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "workout_days")
@Getter
@Setter
public class WorkoutDay {

    @Id
    private int id;

    @ManyToOne
    private WorkoutSchedule schedule;

    @OneToMany(mappedBy = "workoutDay")
    private List<Workout> workouts = new ArrayList<>();

    private String comment;

}
