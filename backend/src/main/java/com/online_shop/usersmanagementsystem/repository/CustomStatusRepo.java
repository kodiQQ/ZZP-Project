package com.online_shop.usersmanagementsystem.repository;

import com.online_shop.usersmanagementsystem.entity.CategoryEntity;
import com.online_shop.usersmanagementsystem.entity.CustomStatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomStatusRepo extends JpaRepository<CustomStatusEntity, Integer> {
}
