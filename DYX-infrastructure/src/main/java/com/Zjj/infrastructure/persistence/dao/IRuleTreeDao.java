package com.Zjj.infrastructure.persistence.dao;

import com.Zjj.infrastructure.persistence.po.RuleTree;

public interface IRuleTreeDao {

    RuleTree queryRuleTreeByTreeId(String treeId);

}
