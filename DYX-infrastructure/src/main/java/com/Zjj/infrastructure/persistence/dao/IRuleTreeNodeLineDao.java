package com.Zjj.infrastructure.persistence.dao;

import com.Zjj.infrastructure.persistence.po.RuleTreeNodeLine;

import java.util.List;

public interface IRuleTreeNodeLineDao {
    List<RuleTreeNodeLine> queryRuleTreeNodeLineListByTreeId(String treeId);


}
