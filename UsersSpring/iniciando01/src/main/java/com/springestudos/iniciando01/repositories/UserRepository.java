package com.springestudos.iniciando01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springestudos.iniciando01.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
