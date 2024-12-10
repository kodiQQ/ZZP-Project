package com.online_shop.usersmanagementsystem.entity;

import com.online_shop.usersmanagementsystem.Enum.TaskStatus;
import jakarta.persistence.*;
import lombok.Builder;

@Entity
@Table(name = "tasks")
@Builder
public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(length = 1000) // Maksymalna długość opisu
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TaskStatus status;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryEntity category;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private OurUsersEntity user;
}
