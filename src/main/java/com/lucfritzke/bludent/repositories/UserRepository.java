package com.lucfritzke.bludent.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import com.lucfritzke.bludent.domain.User.User;


@Repository
public interface UserRepository extends JpaRepository<User, String>{

    UserDetails findByLogin(String login);
    
}
