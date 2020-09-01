package com.research.resbackend.domain.repository;

import com.research.resbackend.domain.ERole;
import com.research.resbackend.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
