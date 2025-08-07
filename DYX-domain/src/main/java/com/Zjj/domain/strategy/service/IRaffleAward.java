package com.Zjj.domain.strategy.service;

import com.Zjj.domain.strategy.model.entity.StrategyAwardEntity;

import java.util.List;

public interface IRaffleAward {
    List<StrategyAwardEntity>queryRaffleStrategyAwardList(Long strategyId);
}
