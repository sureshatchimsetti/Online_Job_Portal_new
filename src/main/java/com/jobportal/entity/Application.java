package com.jobportal.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User applicant;

    @ManyToOne
    private Job job;

    private LocalDate appliedDate;

    // Getters and Setters
}