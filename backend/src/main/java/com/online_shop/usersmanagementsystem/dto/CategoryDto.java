package com.online_shop.usersmanagementsystem.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.online_shop.usersmanagementsystem.entity.CategoryEntity;
import com.online_shop.usersmanagementsystem.entity.ProductsEntity;
import lombok.Builder;
import lombok.Data;

import java.util.List;
@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryDto {
    private Integer id;
    private String name;
    private CategoryEntity categoryEntity;
    private List<CategoryEntity> categoryEntityList;
}
