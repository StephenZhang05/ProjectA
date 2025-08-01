package com.Zjj.infrastructure.persistence.dao;

import com.Zjj.infrastructure.persistence.po.StrategyRule;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IStrategyRuleDao {
    StrategyRule queryStrategyRule(StrategyRule strategyRuleReq);
}
