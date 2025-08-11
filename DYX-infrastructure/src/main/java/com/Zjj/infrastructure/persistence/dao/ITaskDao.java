package com.Zjj.infrastructure.persistence.dao;

import cn.bugstack.middleware.db.router.annotation.DBRouter;
import com.Zjj.infrastructure.persistence.po.Task;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ITaskDao {

    void insert(Task task);

    @DBRouter
    void updateTaskSendMessageCompleted(Task task);

    @DBRouter
    void updateTaskSendMessageFail(Task task);

    List<Task> queryNoSendMessageTaskList();

}
