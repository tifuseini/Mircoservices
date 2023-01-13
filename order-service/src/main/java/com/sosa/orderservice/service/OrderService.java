package com.sosa.orderservice.service;

import com.sosa.orderservice.dto.OrderLineItemsDto;
import com.sosa.orderservice.dto.OrderRequest;
import com.sosa.orderservice.models.Order;
import com.sosa.orderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;


    public void createOrder(Order order) {
        orderRepository.save(order);
    }
}
