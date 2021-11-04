package com.sapiens.SpringDemo.JSRAnnotations;

import javax.annotation.Resource;
import java.util.Arrays;

public class OrderDetailsClient {
    @Resource(name="OrderDetailsA")
    private OrderDetails orderdetails;

    public void showPendingOrderDetails(){
        for(String orderId : Arrays.asList("100", "300", "500", "780")){
            System.out.println(orderdetails.getOrderDetails(orderId));
        }
    }

}
