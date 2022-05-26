package com.luv2code.ecommerce.dto;

import lombok.Getter;
import lombok.Setter;

public class PaymentInfo {

    @Setter
    @Getter
    private int amount;
    private String currency;
    private String receiptEmail;

    public String getCurrency() {
        return currency;
    }

    public String getReceiptEmail() {
        return receiptEmail;
    }
}
