package com.example.getrand_userservice.Repository;

import com.example.getrand_userservice.Entity.MerberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MerberRepository extends JpaRepository<MerberEntity, Long> {
    Optional<MerberEntity> findMerberByUsername(String username);
}
