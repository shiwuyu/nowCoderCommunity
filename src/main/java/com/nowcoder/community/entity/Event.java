package com.nowcoder.community.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * 消息队列事件类
 *
 * @author 张非凡
 * @version 1.0.0
 * @date 2023-10-27 17:11
 */
public class Event {

    private String topic;       // 事件的主题
    private int userId;         // 事件发送方的用户id(这里的发送发统一设置为一个)
    private int entityType;     // 发送内容的类型(赞,评论还是关注信息)
    private int entityId;       // 内容id
    private int entityUserId;   // 接收方的用户id
    private Map<String, Object> data = new HashMap<>();

    public String getTopic() {
        return topic;
    }

    public Event setTopic(String topic) {
        this.topic = topic;
        return this;
    }

    public int getUserId() {
        return userId;
    }

    public Event setUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public int getEntityType() {
        return entityType;
    }

    public Event setEntityType(int entityType) {
        this.entityType = entityType;
        return this;
    }

    public int getEntityId() {
        return entityId;
    }

    public Event setEntityId(int entityId) {
        this.entityId = entityId;
        return this;
    }

    public int getEntityUserId() {
        return entityUserId;
    }

    public Event setEntityUserId(int entityUserId) {
        this.entityUserId = entityUserId;
        return this;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public Event setData(String key, Object value) {
        this.data.put(key, value);
        return this;
    }
}
