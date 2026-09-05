package com.example.createstore.repositories;

import com.example.createstore.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository  extends JpaRepository<Order,Long> {

}
