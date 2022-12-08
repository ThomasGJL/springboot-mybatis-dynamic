package com.example.springbootmybatisdynamic.service;


import com.example.springbootmybatisdynamic.entity.Stock;

public interface StockService {

    Stock getStockById(Integer id);

    void updateStock(Stock stock);
}
