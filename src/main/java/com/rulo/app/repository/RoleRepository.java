package com.rulo.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rulo.app.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
