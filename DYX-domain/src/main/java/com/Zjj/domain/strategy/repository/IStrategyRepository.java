package com.Zjj.domain.strategy.repository;

import com.Zjj.domain.strategy.model.entity.StrategyAwardEntity;
import com.Zjj.domain.strategy.model.entity.StrategyEntity;
import com.Zjj.domain.strategy.model.entity.StrategyRuleEntity;
import com.Zjj.domain.strategy.model.valobj.RuleTreeVO;
import com.Zjj.domain.strategy.model.valobj.StrategyAwardRuleModelVO;
import com.Zjj.domain.strategy.model.valobj.StrategyAwardStockKeyVO;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Map;


public interface IStrategyRepository {
    List<StrategyAwardEntity> queryStrategyAwardList(Long strategyId);

    void storeStrategyAwardSearchRateTable(String key, Integer rateRange, Map<Integer, Integer> strategyAwardSearchRateTable);

    Integer getStrategyAwardAssemble(String key, Integer rateKey);

    int getRateRange(Long strategyId);

    int getRateRange(String key);

    StrategyEntity queryStrategyEntityByStrategyId(Long strategyId);

    StrategyRuleEntity queryStrategyRule(Long strategyId, String ruleModel);

    String queryStrategyRuleValue(Long strategyId, String ruleModel);

    String queryStrategyRuleValue(Long strategyId, Integer awardId, String ruleModel);

    StrategyAwardRuleModelVO queryStrategyAwardRuleModelVO(Long strategyId, Integer awardId);

    /**
     * 根据规则树ID，查询树结构信息
     *
     * @param treeId 规则树ID
     * @return 树结构信息
     */
    RuleTreeVO queryRuleTreeVOByTreeId(String treeId);

    void cacheStrategyAwardCount(String strategyAwardCountKey, Integer awardCount);

    Boolean subStock(String cacheKey,Date endDateTime);

    void sendQueue(StrategyAwardStockKeyVO build);

    StrategyAwardStockKeyVO takeQueueValue() throws InterruptedException;

    void updateStrategyAwardStock(Long strategyId, Integer awardId);

    StrategyAwardEntity queryStrategyAwardEntity(Long strategyId, Integer awardId);
    /**
     * 查询策略ID
     *
     * @param activityId 活动ID
     * @return 策略ID
     */
    Long queryStrategyIdByActivityId(Long activityId);

    /**
     * 查询用户抽奖次数 - 当天的；策略ID:活动ID 1:1 的配置，可以直接用 strategyId 查询。
     *
     * @param userId     用户ID
     * @param strategyId 策略ID
     * @return 用户今日参与次数
     */
    Integer queryTodayUserRaffleCount(String userId, Long strategyId);
    /**
     * 根据规则树ID集合查询奖品中加锁数量的配置「部分奖品需要抽奖N次解锁」
     *
     * @param treeIds 规则树ID值
     * @return key 规则树，value rule_lock 加锁值
     */
    Map<String, Integer> queryAwardRuleLockCount(String[] treeIds);

}
