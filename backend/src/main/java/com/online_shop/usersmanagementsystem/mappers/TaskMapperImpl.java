package com.online_shop.usersmanagementsystem.mappers;


import com.online_shop.usersmanagementsystem.dto.TaskDto;

import com.online_shop.usersmanagementsystem.entity.TaskEntity;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;


@Component
@AllArgsConstructor
public class TaskMapperImpl implements Mapper<TaskEntity, TaskDto> {

    private ModelMapper modelMapper;

    @Override
    public TaskDto mapTo(TaskEntity taskEntity) {
        return modelMapper.map(taskEntity, TaskDto.class);
    }


    @Override
    public TaskEntity mapFrom(TaskDto taskDto) {
        return modelMapper.map(taskDto, TaskEntity.class);
    }
}
