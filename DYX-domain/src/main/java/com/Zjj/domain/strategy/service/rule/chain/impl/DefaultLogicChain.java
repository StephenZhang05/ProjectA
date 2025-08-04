package com.Zjj.domain.strategy.service.rule.chain.impl;

import com.Zjj.domain.strategy.service.rule.chain.AbstractLogicChain;
import com.Zjj.domain.strategy.service.rule.chain.factory.DefaultChainFactory;
import com.Zjj.domain.strategy.service.strategy.IStrategyDispatch;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

/**
 * 兜底责任链，当前面的规则链都不需要执行时，使用兜底责任链来处理逻辑。
 */
@Component("rule_default")
public class DefaultLogicChain extends AbstractLogicChain {
    @Resource
    private IStrategyDispatch strategyDispatch;
    public DefaultChainFactory.StrategyAwardVO logic(String userId, Long strategyId) {
        //默认规则，直接执行抽奖
        Integer awardId=strategyDispatch.getRandomAwardId(strategyId);
        return DefaultChainFactory.StrategyAwardVO.builder()
                .awardId(awardId)
                .logicModel(ruleModel())
                .build();

    }
    @Override
    protected String ruleModel() {
        return DefaultChainFactory.LogicModel.RULE_DEFAULT.getCode();
    }
}
