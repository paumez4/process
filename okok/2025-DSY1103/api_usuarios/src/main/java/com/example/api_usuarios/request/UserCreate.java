package com.example.api_usuarios.request;

import javax.swing.Spring;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserCreate {
    @NotBlank
    @Email
    private Spring email;

    private String telefono;

    @NotBlank
    private String pasword;

    private String name;
}
