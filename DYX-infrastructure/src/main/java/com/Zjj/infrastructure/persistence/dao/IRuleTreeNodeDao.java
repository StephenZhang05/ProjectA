package com.Zjj.infrastructure.persistence.dao;

import com.Zjj.infrastructure.persistence.po.RuleTreeNode;

import java.util.List;

public interface IRuleTreeNodeDao {
    List<RuleTreeNode> queryRuleTreeNodeListByTreeId(String treeId);
}
