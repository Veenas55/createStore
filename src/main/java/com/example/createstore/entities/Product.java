package com.example.createstore.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "products")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "product name is required")
    @Column(nullable = false)
    private String name;
    private String description;

    private String category;

    @DecimalMin(value = "0.0", inclusive = false, message = "Price must be greater than zero")
    private BigDecimal price;

    @NotNull(message = "stock quantity is required")
    @Min(value = 0, message = "stock cannot be less than 0")
    @Column(name = "stock_quantity", nullable = false)
    private Integer stockQuantity;

    @JsonIgnore
    @OneToMany(mappedBy = "product")
    private List<OrderItems> orderItems;

}
