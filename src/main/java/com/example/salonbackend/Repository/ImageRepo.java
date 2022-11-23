package com.example.salonbackend.Repository;
import com.example.salonbackend.Models.Image;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ImageRepo extends JpaRepository<Image, Long> {
//    Optional<Image> findByName(String name);
}
