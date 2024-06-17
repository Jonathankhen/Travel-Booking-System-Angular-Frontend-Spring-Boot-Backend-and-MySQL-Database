package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


@Entity
@Table(name = "vacations")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Vacation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vacation_id", nullable = false)
    private Long id;

    @Column(name = "image_url")
    private String image_URL;

    @Column(name = "vacation_title", nullable = false)
    private String vacation_title;

    @Column(name = "description")
    private String description;

    @Column(name = "travel_fare_price", nullable = false)
    private BigDecimal travel_price;

    @Column(name = "last_update", nullable = false)
    @UpdateTimestamp
    private Date last_update;

    @Column(name = "create_date", nullable = false, updatable = false)
    @CreationTimestamp
    private Date create_date;

    @OneToMany(mappedBy = "vacation", cascade = CascadeType.ALL)
    private Set<Excursion> excursions;
}