package com.Zjj.domain.activity.service.quota;

import com.Zjj.domain.activity.model.entity.ActivityCountEntity;
import com.Zjj.domain.activity.model.entity.ActivityEntity;
import com.Zjj.domain.activity.model.entity.ActivitySkuEntity;
import com.Zjj.domain.activity.repository.IActivityRepository;
import com.Zjj.domain.activity.service.quota.rule.factory.DefaultActivityChainFactory;

public class RaffleActivitySupport {

    protected DefaultActivityChainFactory defaultActivityChainFactory;

    protected IActivityRepository activityRepository;

    public RaffleActivitySupport(IActivityRepository activityRepository, DefaultActivityChainFactory defaultActivityChainFactory) {
        this.activityRepository = activityRepository;
        this.defaultActivityChainFactory = defaultActivityChainFactory;
    }

    public ActivitySkuEntity queryActivitySku(Long sku) {
        return activityRepository.queryActivitySku(sku);
    }

    public ActivityEntity queryRaffleActivityByActivityId(Long activityId) {
        return activityRepository.queryRaffleActivityByActivityId(activityId);
    }

    public ActivityCountEntity queryRaffleActivityCountByActivityCountId(Long activityCountId) {
        return activityRepository.queryRaffleActivityCountByActivityCountId(activityCountId);
    }


}
