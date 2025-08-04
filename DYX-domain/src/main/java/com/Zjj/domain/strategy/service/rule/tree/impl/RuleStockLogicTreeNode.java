package com.Zjj.domain.strategy.service.rule.tree.impl;

import com.Zjj.domain.strategy.model.valobj.RuleLogicCheckTypeVO;
import com.Zjj.domain.strategy.service.rule.tree.ILogicTreeNode;
import com.Zjj.domain.strategy.service.rule.tree.factory.DefaultTreeFactory;
import org.springframework.stereotype.Component;

//库存管理规则节点，将库存条件也视为一种规则
@Component("rule_stock")
public class RuleStockLogicTreeNode implements ILogicTreeNode {
    @Override
    public DefaultTreeFactory.TreeActionEntity logic(String userId, Long strategyId, Integer awardId) {
        return DefaultTreeFactory.TreeActionEntity.builder()
                .ruleLogicCheckType(RuleLogicCheckTypeVO.TAKE_OVER)
                .build();

    }
}
