package com.Zjj.domain.strategy.model.entity;

import lombok.*;

import java.util.Date;

//抽奖因子实体
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class RaffleFactorEntity {
    private String userId; // 用户ID
    private Long strategyId; // 策略ID
    private Integer awardId; // 抽奖奖品ID【规则类型为策略，则不需要奖品ID】
    /** 结束时间 */
    private Date endDateTime;

}
