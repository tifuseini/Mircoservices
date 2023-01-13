package com.sosa.orderservice.repository;

import com.sosa.orderservice.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OrderRepository extends  JpaRepository<Order, UUID> {
}
