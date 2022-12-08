package com.example.springbootmybatisdynamic.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.example.springbootmybatisdynamic.entity.Order;
import org.springframework.stereotype.Repository;

@Repository
@DS("datasource1")
public interface OrderMapper {

    Order getOrderById(Integer id);

    int addOrder(Order order);

}
