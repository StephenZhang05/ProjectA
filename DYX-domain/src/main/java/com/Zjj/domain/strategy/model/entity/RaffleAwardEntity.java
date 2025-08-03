package com.Zjj.domain.strategy.model.entity;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class RaffleAwardEntity {
    private Long strategyId;
    private Integer awardId;
    private String awardKey;
    private String awardConfig;
    private String awardDesc;

}
