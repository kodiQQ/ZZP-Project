package com.online_shop.usersmanagementsystem.service.impl;

import com.online_shop.usersmanagementsystem.dto.CategoryDto;
import com.online_shop.usersmanagementsystem.dto.TaskDto;
import com.online_shop.usersmanagementsystem.entity.CategoryEntity;
import com.online_shop.usersmanagementsystem.entity.OurUsersEntity;
import com.online_shop.usersmanagementsystem.entity.TaskEntity;
import com.online_shop.usersmanagementsystem.mappers.Mapper;
import com.online_shop.usersmanagementsystem.repository.CategoryRepo;
import com.online_shop.usersmanagementsystem.repository.TaskRepo;
import com.online_shop.usersmanagementsystem.service.AdminUserService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Data
public class AdminUserServiceImpl implements AdminUserService {

    private final CategoryRepo categoryRepo;
    private final TaskRepo taskRepo;
    private final Mapper<CategoryEntity, CategoryDto> categoryMapper;
    private final Mapper<TaskEntity, TaskDto> taskMapper;

    @Override
    public  CategoryDto add_category(CategoryDto categoryDto, OurUsersEntity ourUsersEntity) {
        CategoryEntity categotyEntity=CategoryEntity.builder().name(categoryDto.getName()).user(ourUsersEntity).build();
        categoryRepo.save(categotyEntity);
        return categoryMapper.mapTo(categotyEntity);
    }

    @Override
    public  TaskDto add_task(TaskDto taskDto, OurUsersEntity ourUsersEntity) {
        CategoryEntity categoryEntity=categoryRepo.getById(taskDto.getCategoryId());
        TaskEntity taskEntity=TaskEntity.builder()
                .user(ourUsersEntity)
                .title(taskDto.getTitle())
                .description(taskDto.getDescription())
                .status(taskDto.getStatus())
                .category(categoryEntity)
                .user(ourUsersEntity)
                .build();
        taskRepo.save(taskEntity);
        return taskMapper.mapTo(taskEntity);
    }
}
