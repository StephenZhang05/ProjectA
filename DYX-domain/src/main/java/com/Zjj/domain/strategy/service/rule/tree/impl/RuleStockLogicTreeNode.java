package com.Zjj.domain.strategy.service.rule.tree.impl;

import com.Zjj.domain.strategy.model.valobj.RuleLogicCheckTypeVO;
import com.Zjj.domain.strategy.model.valobj.StrategyAwardStockKeyVO;
import com.Zjj.domain.strategy.repository.IStrategyRepository;
import com.Zjj.domain.strategy.service.rule.tree.ILogicTreeNode;
import com.Zjj.domain.strategy.service.rule.tree.factory.DefaultTreeFactory;
import com.Zjj.domain.strategy.service.strategy.IStrategyDispatch;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.Date;

//库存管理规则节点，将库存条件也视为一种规则
@Component("rule_stock")
public class RuleStockLogicTreeNode implements ILogicTreeNode {
    @Resource
    private IStrategyDispatch strategyDispatch;
    @Resource
    private IStrategyRepository strategyRepository;
    @Override
    public DefaultTreeFactory.TreeActionEntity logic(String userId, Long strategyId, Integer awardId, String ruleValue,Date endDateTime) {
        //扣减库存
        Boolean status=strategyDispatch.subStock(strategyId,awardId,new Date());
        if(status){
            //将扣减库存消息发入延迟队列
            strategyRepository.sendQueue(StrategyAwardStockKeyVO.
                    builder().strategyId(strategyId).
                    awardId(awardId).build());
            return DefaultTreeFactory.TreeActionEntity.builder()
                    .ruleLogicCheckType(RuleLogicCheckTypeVO.TAKE_OVER)
                    .strategyAwardVO(DefaultTreeFactory.StrategyAwardVO.builder()
                            .awardId(awardId)
                            .awardRuleValue("ruleValue")
                            .build())
                    .build();

        }
        return DefaultTreeFactory.TreeActionEntity.builder()
                .ruleLogicCheckType(RuleLogicCheckTypeVO.TAKE_OVER)
                .build();

    }
}
