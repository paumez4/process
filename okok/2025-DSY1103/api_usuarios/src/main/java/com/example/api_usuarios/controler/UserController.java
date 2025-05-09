package com.example.api_usuarios.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api_usuarios.models.entities.User;
import com.example.api_usuarios.request.UserCreate;
import com.example.api_usuarios.service.UserService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;



    /*get */
    @GetMapping("/")
       
    public List<User> traerTodos(){
        return userService.obtenerTodos();
    }
    
    @PostMapping("/")
 
    public User crear(@Valid @RequestBody UserCreate nuevo){
        return userService.registrar(nuevo);
    }


    
}
