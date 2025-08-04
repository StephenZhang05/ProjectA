package com.Zjj.domain.strategy.service.rule.chain;

import com.Zjj.domain.strategy.service.rule.chain.factory.DefaultChainFactory;

public interface ILogicChain {
    DefaultChainFactory.StrategyAwardVO logic(String userId, Long strategyId);
    ILogicChain appendNext(ILogicChain nextChain);
    ILogicChain Next();

}
