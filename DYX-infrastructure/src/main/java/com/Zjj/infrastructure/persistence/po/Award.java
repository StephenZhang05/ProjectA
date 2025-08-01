package com.Zjj.infrastructure.persistence.po;

import lombok.Data;

import java.sql.Date;

@Data
public class Award {
    private Integer id;
    private Integer awardId;
    private String awardKey;
    private String awardConfig;
    private String awardDesc;
    private String awardTime;
    private Date createTime;
    private Date updateTime;
}
