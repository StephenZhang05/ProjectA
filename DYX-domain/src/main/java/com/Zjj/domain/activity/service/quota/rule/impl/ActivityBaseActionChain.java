package com.Zjj.domain.activity.service.quota.rule.impl;

import com.Zjj.domain.activity.model.entity.ActivityCountEntity;
import com.Zjj.domain.activity.model.entity.ActivityEntity;
import com.Zjj.domain.activity.model.entity.ActivitySkuEntity;
import com.Zjj.domain.activity.model.valobj.ActivityStateVO;
import com.Zjj.domain.activity.service.quota.rule.AbstractActionChain;
import com.Zjj.types.exception.AppException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Date;

@Slf4j
@Component("activity_base_action")
public class ActivityBaseActionChain extends AbstractActionChain {
    @Override
    public boolean action(ActivitySkuEntity activitySkuEntity, ActivityEntity activityEntity, ActivityCountEntity activityCountEntity) {

        log.info("活动责任链-基础信息【有效期、状态】校验开始。");
        if (!ActivityStateVO.open.equals(activityEntity.getState())) {

        }
        Date currentTime = new Date();
        if (activityEntity.getBeginDateTime().after(currentTime) || activityEntity.getEndDateTime().before(currentTime)) {
            log.error("活动责任链-基础信息【有效期、状态】校验失败，当前时间不在活动有效期内。");
            throw new AppException("A0001", "当前时间不在活动有效期内");

        }
        if(activitySkuEntity.getStockCountSurplus() < 1){
            log.error("活动责任链-基础信息【有效期、状态】校验失败，活动库存不足。");
            throw new AppException("A0002", "活动库存不足");
        }
        return next().action(activitySkuEntity,activityEntity,activityCountEntity);
    }

}
