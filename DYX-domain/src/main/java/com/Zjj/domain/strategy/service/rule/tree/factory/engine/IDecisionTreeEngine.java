package com.Zjj.domain.strategy.service.rule.tree.factory.engine;

import com.Zjj.domain.strategy.service.rule.tree.factory.DefaultTreeFactory;

/**
 * 决策树引擎接口
 */
public interface IDecisionTreeEngine {
    /**
     * 返回最后决策树的结果
     *
     * @param userId
     * @param strategyId
     * @param awardId
     * @return
     */
    DefaultTreeFactory.StrategyAwardVO process(String userId, Long strategyId, Integer awardId);
}
