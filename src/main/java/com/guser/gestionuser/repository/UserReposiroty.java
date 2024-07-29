package com.guser.gestionuser.repository;

import com.guser.gestionuser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserReposiroty extends JpaRepository<User,Long> {
}
