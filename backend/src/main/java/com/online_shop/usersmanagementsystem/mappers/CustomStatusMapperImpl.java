package com.online_shop.usersmanagementsystem.mappers;

import com.online_shop.usersmanagementsystem.dto.CustomStatusDto;
import com.online_shop.usersmanagementsystem.dto.CustomStatusDto;
import com.online_shop.usersmanagementsystem.entity.CustomStatusEntity;
import com.online_shop.usersmanagementsystem.entity.CustomStatusEntity;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;


@Component
@AllArgsConstructor
public class CustomStatusMapperImpl implements Mapper<CustomStatusEntity, CustomStatusDto> {

    private ModelMapper modelMapper;

    @Override
    public CustomStatusDto mapTo(CustomStatusEntity customStatusEntity) {
        return modelMapper.map(customStatusEntity, CustomStatusDto.class);
    }


    @Override
    public CustomStatusEntity mapFrom(CustomStatusDto customStatusDto) {
        return modelMapper.map(customStatusDto, CustomStatusEntity.class);
    }
}
