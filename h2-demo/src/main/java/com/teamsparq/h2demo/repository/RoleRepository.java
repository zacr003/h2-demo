package com.teamsparq.h2demo.repository;

import com.teamsparq.h2demo.entity.Role;

import com.teamsparq.h2demo.model.ERole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}


