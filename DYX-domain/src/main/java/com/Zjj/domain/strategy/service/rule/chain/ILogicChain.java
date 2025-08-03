package com.Zjj.domain.strategy.service.rule.chain;

public interface ILogicChain {
    Integer logic(String userId,Long strategyId);
    ILogicChain appendNext(ILogicChain nextChain);
    ILogicChain Next();

}
