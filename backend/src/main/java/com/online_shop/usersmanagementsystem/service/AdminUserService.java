package com.online_shop.usersmanagementsystem.service;

import com.online_shop.usersmanagementsystem.dto.CategoryDto;
import com.online_shop.usersmanagementsystem.dto.CustomStatusDto;
import com.online_shop.usersmanagementsystem.dto.TaskDto;
import com.online_shop.usersmanagementsystem.entity.OurUsersEntity;

public interface AdminUserService {
    CategoryDto add_category(CategoryDto categoryDto, OurUsersEntity ourUsersEntity);
    CategoryDto getAllCategories(OurUsersEntity ourUsersEntity);
    TaskDto add_task(TaskDto taskDto, OurUsersEntity ourUsersEntity);
    CustomStatusDto add_customStatus(CustomStatusDto customStatusDto, OurUsersEntity ourUsersEntity);


}
