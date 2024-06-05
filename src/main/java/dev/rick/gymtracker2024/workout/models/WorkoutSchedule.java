package dev.rick.gymtracker2024.workout.models;

import dev.rick.gymtracker2024.user.User;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "schedules")
public class WorkoutSchedule {

    @Id
    @GeneratedValue
    private int id;

    private int trainingDays;

    private int startWeekNum;

    private int endWeekNum;

    private List<WorkoutDay> workoutDays = new ArrayList<>();

    private String comment;

    @ManyToOne
    private User user;
}
