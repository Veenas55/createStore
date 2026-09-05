package com.example.createstore.repositories;

import com.example.createstore.entities.OrderItems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemsRepository extends JpaRepository<OrderItems,Long> {
}
