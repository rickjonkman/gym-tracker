package dev.rick.gymtracker2024.user;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    private String username;
    private String password;
    private int age;
    private List<WorkoutWeek> weeks;

}
