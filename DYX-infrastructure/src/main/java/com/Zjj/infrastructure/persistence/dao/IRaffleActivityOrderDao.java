package com.Zjj.infrastructure.persistence.dao;

import com.Zjj.infrastructure.persistence.po.RaffleActivityOrder;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
//@DBRouterStrategy(splitTable = true)
public interface IRaffleActivityOrderDao {

//    @DBRouter(key = "userId")
    void insert(RaffleActivityOrder raffleActivityOrder);

//    @DBRouter
    List<RaffleActivityOrder> queryRaffleActivityOrderByUserId(String userId);

}
