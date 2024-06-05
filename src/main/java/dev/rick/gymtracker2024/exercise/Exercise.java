package dev.rick.gymtracker2024.exercise;

import dev.rick.gymtracker2024.enums.MuscleGroup;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
public class Exercise {

    @Id
    private long id;

    private String name;

    private MuscleGroup muscleGroupPrimary;

    private MuscleGroup muscleGroupSecondary;

    private boolean favourite;

}
