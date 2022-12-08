package com.example.springbootmybatisdynamic.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.example.springbootmybatisdynamic.entity.Stock;
import org.springframework.stereotype.Repository;

@Repository
@DS("datasource2")
public interface StockMapper {

    Stock getStockById(Integer id);

    void updateStock(Stock stock);
}
