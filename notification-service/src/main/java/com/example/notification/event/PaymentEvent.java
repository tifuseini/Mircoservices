package com.example.notification.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentEvent {

    private String orderId;
    private String paymentId;
    private String paymentStatus;
    private String paymentAmount;
    private String paymentDate;


}
