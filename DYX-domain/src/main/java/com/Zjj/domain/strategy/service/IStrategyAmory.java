package com.Zjj.domain.strategy.service;

public interface IStrategyAmory {
    boolean assembleLotteryStrategy(Long strategyId);

    Integer getRandomAwardId(Long strategyId);
}
