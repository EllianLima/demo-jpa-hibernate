package com.elliandemo.demo_jpa_hibernate.repositories;

import com.elliandemo.demo_jpa_hibernate.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
