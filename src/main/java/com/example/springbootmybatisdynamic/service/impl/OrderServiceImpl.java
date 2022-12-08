package com.example.springbootmybatisdynamic.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.example.springbootmybatisdynamic.dao.OrderMapper;
import com.example.springbootmybatisdynamic.entity.Order;
import com.example.springbootmybatisdynamic.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@DS("datasource1")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public Order getOrderById(Integer id) {
        return orderMapper.getOrderById(id);
    }

    @Override
    @Transactional
    public void addOrder(Order order) {
        orderMapper.addOrder(order);
    }
}
