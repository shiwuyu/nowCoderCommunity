package com.nowcoder.community.dao;

import com.nowcoder.community.entity.Message;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Program: community
 * @Description: 私信Mapper类
 * 附加说明: 一个用户会有很多私信,私信相当于会话, 每个会话只显示最新消息, 但是需要显示发了几条消息
 * @Author: 张非凡
 * @Create: 2023-07-29 22:24
 */
@Mapper
public interface MessageMapper {

    /**
     * @description: 查询当前用户会话列表，针对每个会话值返回一条最新私信
     * @param: [userId, offset, limit]
     * @return: java.util.List<com.nowcoder.community.entity.Message>
     */
    List<Message> selectConversations(int userId, int offset, int limit);

    /**
     * @description: 查询当前用户会话数量
     * @param: [userId]
     * @return: int
     */
    int selectConversationCount(int userId);

    /**
     * @description: 查询某个会话包含的私信列表
     * @param: [conversationId, offset, limit]
     * @return: java.util.List<com.nowcoder.community.entity.Message>
     */
    List<Message> selectLetters(String conversationId, int offset, int limit);

    /**
     * @description: 查询某个会话包含的私信数量
     * @param: [conversationId]  会话ID
     * @return: int
     */
    int selectLetterCount(String conversationId);

    /**
     * @description: 查询未读私信的数量
     * @param: [userId, conversationId]
     * @return: int
     */
    int selectLetterUnreadCount(int userId, String conversationId);

    /**
     * @description: 新增消息
     * @param: [message]
     * @return: int
     */
    int insertMessage(Message message);

    /**
     * @description: 修改消息状态
     * @param: [ids, status]
     * @return: int
     */
    int updateStatus(List<Integer> ids, int status);
}
