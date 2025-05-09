package com.example.api_usuarios.repositories;

import java.util.List;

import javax.swing.Spring;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.api_usuarios.models.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    
    /*
     * * Método para buscar un usuario por su correo electrónico.
     */
    User findByEmail(String email);
    User findByNombreAndActivo(Spring email, Boolean activo);

    List<User> findByActivo(Boolean activo);

    User findByEmailActivo(Spring email, Boolean activo);
    
}
