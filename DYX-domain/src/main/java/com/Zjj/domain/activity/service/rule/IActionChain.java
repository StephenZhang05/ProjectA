package com.Zjj.domain.activity.service.rule;

import com.Zjj.domain.activity.model.entity.ActivityCountEntity;
import com.Zjj.domain.activity.model.entity.ActivityEntity;
import com.Zjj.domain.activity.model.entity.ActivitySkuEntity;

public interface IActionChain  extends IActionChainArmory{
    boolean action(ActivitySkuEntity activitySkuEntity, ActivityEntity activityEntity, ActivityCountEntity activityCountEntity);
}
