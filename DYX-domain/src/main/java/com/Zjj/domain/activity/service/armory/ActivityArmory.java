package com.Zjj.domain.activity.service.armory;

import com.Zjj.domain.activity.model.entity.ActivitySkuEntity;
import com.Zjj.domain.activity.repository.IActivityRepository;
import com.Zjj.types.common.Constants;
import jakarta.annotation.Resource;

import java.util.Date;

public class ActivityArmory implements IActivityArmory, IActivityDispatch{
@Resource
private IActivityRepository activityRepository;
    @Override
    public Boolean assembleActivitySku(Long sku) {
        ActivitySkuEntity activitySkuEntity=activityRepository.queryActivitySku(sku);
        cacheActivitySkuCount(sku,activitySkuEntity.getStockCount());
        // 预热活动【查询时预热到缓存】
        activityRepository.queryRaffleActivityByActivityId(activitySkuEntity.getActivityId());

        // 预热活动次数【查询时预热到缓存】
        activityRepository.queryRaffleActivityCountByActivityCountId(activitySkuEntity.getActivityCountId());


        return true;
    }

    private void cacheActivitySkuCount(Long sku, Integer stockCount) {
        String cacheKey = Constants.RedisKey.ACTIVITY_SKU_STOCK_COUNT_KEY + sku;
        activityRepository.cacheActivitySkuCount(cacheKey, stockCount);
    }
    @Override
    public boolean subtractionActivitySkuStock(Long sku, Date endDateTime) {
        String cacheKey = Constants.RedisKey.ACTIVITY_SKU_STOCK_COUNT_KEY + sku;
        return activityRepository.subtractionActivitySkuStock(sku, cacheKey, endDateTime);
    }

}
