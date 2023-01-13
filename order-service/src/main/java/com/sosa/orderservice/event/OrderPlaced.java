package com.sosa.orderservice.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderPlaced {

    private String orderId;
    private String productId;
    private int quantity;
    private String address;
}
