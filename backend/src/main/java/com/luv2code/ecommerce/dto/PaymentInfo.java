package com.luv2code.ecommerce.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class PaymentInfo {
    private int amount;
    private String currency;
    private String receiptEmail;
}