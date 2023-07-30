package com.souksentry.souksentry.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    private UUID uuid;

    private String name;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    private String brand;
    private String description;
}
