package com.sapiens.SpringDemo.JSRAnnotations;

public class OrderDetailsImpl3 implements OrderDetails{
    @Override
    public String getOrderDetails(String orderId) {
        return "Order Details from Impl3 to order id: "+orderId;
    }
}
