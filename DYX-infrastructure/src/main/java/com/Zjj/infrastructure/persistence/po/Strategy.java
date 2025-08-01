package com.Zjj.infrastructure.persistence.po;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.checkerframework.checker.units.qual.A;

import java.sql.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Strategy {
    private Long id;
    private Long strategyId;
    private String strategyDesc;
    private Date createTime;
    private Date updateTime;
    private String ruleModels;

}
