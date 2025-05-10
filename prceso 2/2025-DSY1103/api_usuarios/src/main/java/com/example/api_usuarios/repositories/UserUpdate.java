package com.example.api_usuarios.repositories;


import lombok.Data;

@Data
public class UserUpdate {
    
    private int id;
    
    private String nombre;

    private String password;

    private String telefono;
}
