package com.Zjj.domain.strategy.service.rule.chain.impl;

import com.Zjj.domain.strategy.repository.IStrategyRepository;
import com.Zjj.domain.strategy.service.rule.chain.AbstractLogicChain;
import com.Zjj.domain.strategy.service.rule.chain.factory.DefaultChainFactory;
import com.Zjj.types.common.Constants;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

/**
 * 黑名单逻辑链
 * 该逻辑链用于处理用户是否在黑名单中
 */
@Component("black_list")
public class BackListLogicChain extends AbstractLogicChain {
    @Resource
    private IStrategyRepository strategyRepository;

    public DefaultChainFactory.StrategyAwardVO logic(String userId, Long strategyId) {
        // 这里可以添加黑名单逻辑的具体实现
        // 比如查询数据库或缓存，判断用户是否在黑名单中
        // 如果在黑名单中，返回一个特定的值，比如-1
        // 如果不在黑名单中，调用下一个逻辑链
        String ruleValue = strategyRepository.queryStrategyRuleValue(strategyId, ruleModel());//获取黑名单规则值
        String[] splite = ruleValue.split(":");
        Integer awardId = Integer.parseInt(splite[0]);//获取奖品id
        // 过滤其他规则
        String[] userBlackIds = splite[1].split(Constants.SPLIT);
        for (String userBlackId : userBlackIds) {//遍历黑名单用户id
            if(userId.equals(userBlackId)){
                //如果是黑名单，返回结果
                return DefaultChainFactory.StrategyAwardVO.builder()
                        .awardId(awardId)
                        .logicModel(ruleModel())
                        .build();

            }
        }
        return Next().logic(userId, strategyId);
    }

    @Override
    protected String ruleModel() {
        return DefaultChainFactory.LogicModel.RULE_BLACKLIST.getCode();
    }
}
