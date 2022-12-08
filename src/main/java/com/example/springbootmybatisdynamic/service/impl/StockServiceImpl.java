package com.example.springbootmybatisdynamic.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.example.springbootmybatisdynamic.dao.StockMapper;
import com.example.springbootmybatisdynamic.entity.Stock;
import com.example.springbootmybatisdynamic.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@DS("datasource2")
public class StockServiceImpl implements StockService {

    @Autowired
    StockMapper stockMapper;

    @Override
    public Stock getStockById(Integer id) {
        return stockMapper.getStockById(id);
    }

    @Override
    @Transactional
    public void updateStock(Stock stock) {

        stockMapper.updateStock(stock);
    }



}
