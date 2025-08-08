package com.ecommerce.app;

import com.ecomerce.app.model.OrderService;
//import com.ecommerce.app.model.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(EcommerceMain.class);

        OrderService orderService = context.getBean(OrderService.class);
        String result = orderService.checkout("CART001");
        System.out.println(result);
    }
}