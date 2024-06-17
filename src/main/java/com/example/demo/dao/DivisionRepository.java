package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.example.demo.entities.Division;

@CrossOrigin
public interface DivisionRepository extends JpaRepository<Division, Long> {
}
