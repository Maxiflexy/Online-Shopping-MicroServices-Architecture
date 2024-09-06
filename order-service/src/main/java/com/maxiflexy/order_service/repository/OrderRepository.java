package com.maxiflexy.order_service.repository;

import com.maxiflexy.order_service.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
