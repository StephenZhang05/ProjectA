package com.Zjj.domain.strategy.repository;

import com.Zjj.domain.strategy.model.entity.StrategyAwardEntity;
import com.Zjj.domain.strategy.model.entity.StrategyEntity;
import com.Zjj.domain.strategy.model.entity.StrategyRuleEntity;
import com.Zjj.domain.strategy.model.valobj.StrategyAwardRuleModelVO;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


public interface IStrategyRepository {
    List<StrategyAwardEntity> queryStrategyAwardList(Long strategyId);

    void storeStrategyAwardSearchRateTable(String key, Integer rateRange, Map<Integer, Integer> strategyAwardSearchRateTable);


    int getRateRange(Long strategyId);
    Integer getStrategyAwardAssemble(String key, Integer rateKey);

    int getRateRange(String key);

    StrategyEntity queryStrategyEntityByStrategyId(Long strategyId);

    StrategyRuleEntity queryStrategyRule(Long strategyId, String ruleModel);

    String queryStrategyRuleValue(Long strategyId, Integer awardId, String ruleModel);
    String queryStrategyRuleValue(Long strategyId,  String ruleModel);

    StrategyAwardRuleModelVO queryStrategyAwardRuleModelVO(Long strategyId, Integer awardId);
}
