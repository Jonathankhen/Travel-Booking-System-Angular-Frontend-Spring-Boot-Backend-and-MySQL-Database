package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.example.demo.entities.Excursion;

@CrossOrigin
public interface ExcursionRepository extends JpaRepository<Excursion, Long> {
}
