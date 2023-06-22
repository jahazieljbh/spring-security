package com.jahaziel.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jahaziel.spring.model.Role;
import com.jahaziel.spring.model.ERole;

import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}