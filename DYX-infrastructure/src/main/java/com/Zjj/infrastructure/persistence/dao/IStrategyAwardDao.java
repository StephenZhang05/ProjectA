package com.Zjj.infrastructure.persistence.dao;

import com.Zjj.domain.strategy.model.entity.StrategyAwardEntity;
import com.Zjj.infrastructure.persistence.po.StrategyAward;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IStrategyAwardDao {
    List<StrategyAward> queryStrategyAwardListByStrategyId(Long strategyId);
}
