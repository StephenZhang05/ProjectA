package com.Zjj.domain.strategy.service.rule.FILTER;

import com.Zjj.domain.strategy.model.entity.RuleActionEntity;
import com.Zjj.domain.strategy.model.entity.RuleMatterEntity;

public interface ILogicFilter<T extends RuleActionEntity.RaffleEntity> {
    RuleActionEntity< T> filter(RuleMatterEntity ruleMatterEntity);
}
