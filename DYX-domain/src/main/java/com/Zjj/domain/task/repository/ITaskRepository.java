package com.Zjj.domain.task.repository;



import com.Zjj.domain.task.model.TaskEntity;

import java.util.List;

public interface ITaskRepository {
    List<com.Zjj.domain.task.model.TaskEntity> queryNoSendMessageTaskList();

    void sendMessage(TaskEntity taskEntity);

    void updateTaskSendMessageCompleted(String userId, String messageId);

    void updateTaskSendMessageFail(String userId, String messageId);

}
