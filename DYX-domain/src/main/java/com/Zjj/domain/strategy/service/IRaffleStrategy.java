package com.Zjj.domain.strategy.service;

import com.Zjj.domain.strategy.model.entity.RaffleAwardEntity;
import com.Zjj.domain.strategy.model.entity.RaffleFactorEntity;

public interface IRaffleStrategy {
    RaffleAwardEntity performRaffle(RaffleFactorEntity raffleFactorEntity);


}
