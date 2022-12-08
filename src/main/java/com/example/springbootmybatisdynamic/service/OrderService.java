package com.example.springbootmybatisdynamic.service;


import com.example.springbootmybatisdynamic.entity.Order;

public interface OrderService {

    Order getOrderById(Integer id);

    void addOrder(Order order);

}
