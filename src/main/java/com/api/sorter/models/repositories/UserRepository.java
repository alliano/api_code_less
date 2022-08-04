package com.api.sorter.models.repositories;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.sorter.models.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
   
   public Optional<User> findByEmail(String email);

   public Page<User> findByNameContains(String name, Pageable page);
}
