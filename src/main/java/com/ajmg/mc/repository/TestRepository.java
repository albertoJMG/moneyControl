package com.ajmg.mc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ajmg.mc.entities.Test;

@Repository
public interface TestRepository extends JpaRepository<Test, Long> {
    
}
