package com.example.springbootmybatisdynamic.controller;

import com.example.springbootmybatisdynamic.entity.Order;
import com.example.springbootmybatisdynamic.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;


    @GetMapping("/getOrder")
    public Order getOrder(@RequestParam("id") int id){
        return orderService.getOrderById(id);
    }

    @GetMapping("/addOrder")
    public void addOrder()
    {
        Order order = new Order();
        order.setUser_id("1");
        order.setCommodity_code("product-1");
        order.setCount(1);
        order.setMoney(5);

        orderService.addOrder(order);
    }


}
