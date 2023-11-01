package com.example.demo.entity;

import com.example.demo.enums.Engine;
import com.example.demo.enums.Transmission;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "offer")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public class Offer extends BaseModifiedEntity {

    @Column(name = "description")
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "engine")
    private Engine engine;

    @Column(name = "imageUrl")
    private String imageUrl;

    @Column(name = "mileage")
    private int mileage;

    @Column(name = "price")
    private Double price;

    @Enumerated(EnumType.STRING)
    @Column(name = "transmission")
    private Transmission transmission;

    @Column(name = "productionYear")
    private int year;



    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "model_id", nullable = false)
    private Model model;

    @ManyToOne
    @JoinColumn(name = "seller_id", nullable = false)
    private User seller;
}
