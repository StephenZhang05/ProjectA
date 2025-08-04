package com.Zjj.domain.strategy.service.rule.tree.impl;

import com.Zjj.domain.strategy.model.valobj.RuleLogicCheckTypeVO;
import com.Zjj.domain.strategy.service.rule.tree.ILogicTreeNode;
import com.Zjj.domain.strategy.service.rule.tree.factory.DefaultTreeFactory;
import org.springframework.stereotype.Component;

@Component("rule_luck_award")
public class RuleLockAwardLogicTreeNode implements ILogicTreeNode{

    @Override
    public DefaultTreeFactory.TreeActionEntity logic(String userId, Long strategyId, Integer awardId) {
        return DefaultTreeFactory.TreeActionEntity.builder()
                .ruleLogicCheckType(RuleLogicCheckTypeVO.TAKE_OVER)
                .strategyAwardData(DefaultTreeFactory.StrategyAwardData.builder()
                        .awardId(101)
                        .awardRuleValue("1,100")
                        .build())
                .build();

    }
}
