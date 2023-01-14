package com.sosa.paymentapplication.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentEvent {

    private String paymentId;
    private String orderId;
    private String paymentStatus;
    private String transactionId;
    private double amount;
    private String paymentType;

}
