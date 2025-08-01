package com.Zjj.infrastructure.persistence.dao;

import com.Zjj.infrastructure.persistence.po.Strategy;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IStrategyDao {
    Strategy queryStrategyByStrategyId(Long strategyId);
}
