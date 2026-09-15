package com.example.createstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.createstore.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{


}
