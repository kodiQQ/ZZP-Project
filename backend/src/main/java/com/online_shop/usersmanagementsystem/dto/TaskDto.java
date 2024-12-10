package com.online_shop.usersmanagementsystem.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.online_shop.usersmanagementsystem.Enum.TaskStatus;
import com.online_shop.usersmanagementsystem.entity.CategoryEntity;
import com.online_shop.usersmanagementsystem.entity.OurUsersEntity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TaskDto {

    private String title;
    private String description;
    private TaskStatus status;
    private Integer categoryId;
    private Integer userId;
}
