package com.online_shop.usersmanagementsystem.controller;

import com.online_shop.usersmanagementsystem.dto.CategoryDto;
import com.online_shop.usersmanagementsystem.dto.CustomStatusDto;
import com.online_shop.usersmanagementsystem.dto.ProductDto;
import com.online_shop.usersmanagementsystem.dto.TaskDto;
import com.online_shop.usersmanagementsystem.entity.OurUsersEntity;
import com.online_shop.usersmanagementsystem.repository.UsersRepo;
import com.online_shop.usersmanagementsystem.service.AdminUserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/adminuser")
@AllArgsConstructor
public class AdminUserController {
    AdminUserService adminUserService;
    UsersRepo usersRepo;

    @PostMapping("/add_category")
    public ResponseEntity<CategoryDto> add_category(@RequestBody CategoryDto categoryDto){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String email = authentication.getName();
        Optional<OurUsersEntity> ourUsersOptional=usersRepo.findByEmail(email);
        OurUsersEntity ourUsersEntity=ourUsersOptional.get();
//        if (ourUsersOptional.isPresent()){
//            OurUsersEntity ourUsersEntity=ourUsersOptional.get();
//        }else{
//            OurUsersEntity ourUsersEntity=null;
//        }
        return ResponseEntity.ok(adminUserService.add_category(categoryDto,ourUsersEntity));
    }

    @PostMapping("/add_task")
    public ResponseEntity<TaskDto> add_category(@RequestBody TaskDto taskDto){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String email = authentication.getName();
        Optional<OurUsersEntity> ourUsersOptional=usersRepo.findByEmail(email);
        OurUsersEntity ourUsersEntity=ourUsersOptional.get();
//        if (ourUsersOptional.isPresent()){
//            OurUsersEntity ourUsersEntity=ourUsersOptional.get();
//        }else{
//            OurUsersEntity ourUsersEntity=null;
//        }
        return ResponseEntity.ok(adminUserService.add_task(taskDto,ourUsersEntity));
    }

    @PostMapping("/add_status")
    public ResponseEntity<CustomStatusDto> add_customStatus(@RequestBody CustomStatusDto customStatusDto){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String email = authentication.getName();
        Optional<OurUsersEntity> ourUsersOptional=usersRepo.findByEmail(email);
        OurUsersEntity ourUsersEntity=ourUsersOptional.get();
//        if (ourUsersOptional.isPresent()){
//            OurUsersEntity ourUsersEntity=ourUsersOptional.get();
//        }else{
//            OurUsersEntity ourUsersEntity=null;
//        }
        return ResponseEntity.ok(adminUserService.add_customStatus(customStatusDto,ourUsersEntity));
    }

    @GetMapping(path = "/getAllCategories")
    public ResponseEntity<CategoryDto> getNews() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String email = authentication.getName();
        Optional<OurUsersEntity> ourUsersOptional=usersRepo.findByEmail(email);
        OurUsersEntity ourUsersEntity=ourUsersOptional.get();
        return new ResponseEntity<>(adminUserService.getAllCategories(ourUsersEntity), HttpStatus.OK);
    }

//    @GetMapping(path = "/getAllTasks")
//    public ResponseEntity<NewsDto> getNews(@PathVariable("id") Long id) {
//        return new ResponseEntity<>(newsService.findOne(id), HttpStatus.OK);
//    }
//
//    @GetMapping(path = "/getAllCustomStatuses")
//    public ResponseEntity<NewsDto> getNews(@PathVariable("id") Long id) {
//        return new ResponseEntity<>(newsService.findOne(id), HttpStatus.OK);
//    }



}
