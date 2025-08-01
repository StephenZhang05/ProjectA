package com.Zjj.infrastructure.persistence.po;

import lombok.Data;

import java.math.BigDecimal;
import java.sql.Date;
@Data
public class StrategyAward {
    private Long id;
    private Long strategyId;
    private Integer awardId;
    private String awardTitle;
    private String awardSubtitle;
    private int awardCount;
    private int awardCountSurplus;
    private BigDecimal awardRate;
    private String ruleModels;
    private int sort;
    private Date createTime;
    private Date updateTime;
}
