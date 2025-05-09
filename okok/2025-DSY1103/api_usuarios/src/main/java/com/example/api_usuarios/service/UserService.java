package com.example.api_usuarios.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.api_usuarios.models.entities.User;
import com.example.api_usuarios.repositories.UserRepository;
import com.example.api_usuarios.request.UserCreate;


/*Lo primero que se pone*/
@Service
public class UserService {
    @Autowired
    /*Buscar esto yque o ocupe aca */
    private UserRepository userRepo;
    
    public List<User> obtenerTodos(){
        return userRepo.findAll();
    }
    
    public List<User> obtenerActivos(){
        return userRepo.findByActivo(true);
    }

    public User obtenerPorEmail(String email){
        User usuario = userRepo.findByEmail(email);
        if(usuario==null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        }
        return usuario;

    }
    public User registrar(UserCreate usuario){
        User nuevoUser= new User();
        nuevoUser.setActivo(true);
        nuevoUser.setFechaCreacion(new Date());
        
        nuevoUser.setPassword(usuario.getPasword());
        nuevoUser.setEmail(usuario.getEmail());
        nuevoUser.setTelefono(usuario.getTelefono());
        nuevoUser.setNombre(usuario.getName());



        return userRepo.save(nuevoUser);

    }




}
