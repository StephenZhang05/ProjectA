package com.Zjj.infrastructure.persistence.dao;

import com.Zjj.infrastructure.persistence.po.RaffleActivitySku;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IRaffleActivitySkuDao {
    RaffleActivitySku queryActivitySku(Long sku);
}
