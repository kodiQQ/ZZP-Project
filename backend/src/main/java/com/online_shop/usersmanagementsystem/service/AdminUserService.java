package com.online_shop.usersmanagementsystem.service;

import com.online_shop.usersmanagementsystem.dto.CategoryDto;
import com.online_shop.usersmanagementsystem.dto.TaskDto;
import com.online_shop.usersmanagementsystem.entity.OurUsersEntity;

public interface AdminUserService {
    CategoryDto add_category(CategoryDto categoryDto, OurUsersEntity ourUsersEntity);
    TaskDto add_task(TaskDto taskDto, OurUsersEntity ourUsersEntity);


}
