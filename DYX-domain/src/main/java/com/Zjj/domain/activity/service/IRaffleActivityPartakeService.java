package com.Zjj.domain.activity.service;

import com.Zjj.domain.activity.model.entity.PartakeRaffleActivityEntity;
import com.Zjj.domain.activity.model.entity.UserRaffleOrderEntity;

public interface IRaffleActivityPartakeService {
    UserRaffleOrderEntity createOrder(PartakeRaffleActivityEntity partakeRaffleActivityEntity);
}
