package com.example.notification.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductEvent {

    private String productId;
    private String productName;
    private String productDescription;
    private String productPrice;
}
