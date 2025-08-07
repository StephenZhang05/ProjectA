package com.Zjj.infrastructure.persistence.dao;

import com.Zjj.infrastructure.persistence.po.RaffleActivityCount;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IRaffleActivityCountDao {
    RaffleActivityCount queryRaffleActivityCountByActivityCountId(Long activityCountId);


}
