package com.souksentry.souksentry.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "markets")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Market {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long marketId;

    private String url;
    private String name;
    private String location;
    private String country;
    private UUID uuid;

    @OneToMany
    @JoinColumn(name = "product_id")
    private List<Product> productList;
}
