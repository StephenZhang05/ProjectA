package com.Zjj.infrastructure.persistence.dao;

import cn.bugstack.middleware.db.router.annotation.DBRouter;
import com.Zjj.infrastructure.persistence.po.RaffleActivityAccountDay;
import com.Zjj.infrastructure.persistence.po.RaffleActivityAccountMonth;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IRaffleActivityAccountMonthDao {


    @DBRouter
    RaffleActivityAccountMonth queryActivityAccountMonthByUserId(RaffleActivityAccountMonth raffleActivityAccountMonthReq);

    int updateActivityAccountMonthSubtractionQuota(RaffleActivityAccountMonth raffleActivityAccountMonth);

    void insertActivityAccountMonth(RaffleActivityAccountMonth raffleActivityAccountMonth);



}
