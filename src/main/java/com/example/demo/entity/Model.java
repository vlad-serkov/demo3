package com.example.demo.entity;

import com.example.demo.enums.Category;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "model")
@EntityListeners(AuditingEntityListener.class)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Model extends BaseModifiedEntity {

    @Column(name = "name")
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "category")
    private Category category;

    @Column(name = "imageUrl")
    private String imageUrl;

    @Column(name = "startYear")
    private int startYear;

    @Column(name = "endYear")
    private int endYear;

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "brand_id", nullable = false)
    private Brand brand;

}
