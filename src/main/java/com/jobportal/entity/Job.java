package com.jobportal.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String location;

    @ManyToOne
    private User employer;

    private LocalDate postedDate;

    // Getters and Setters
}