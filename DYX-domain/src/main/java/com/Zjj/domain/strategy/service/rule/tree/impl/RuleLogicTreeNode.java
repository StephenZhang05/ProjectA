package com.Zjj.domain.strategy.service.rule.tree.impl;

import com.Zjj.domain.strategy.model.valobj.RuleLogicCheckTypeVO;
import com.Zjj.domain.strategy.service.rule.tree.ILogicTreeNode;
import com.Zjj.domain.strategy.service.rule.tree.factory.DefaultTreeFactory;
import org.springframework.stereotype.Component;

@Component("rule_lock")
public class RuleLogicTreeNode implements ILogicTreeNode {

    @Override
    public DefaultTreeFactory.TreeActionEntity logic(String userId, Long strategyId, Integer awardId) {
        return DefaultTreeFactory.TreeActionEntity.builder()
                .ruleLogicCheckType(RuleLogicCheckTypeVO.ALLOW)
                .build();

    }
}
