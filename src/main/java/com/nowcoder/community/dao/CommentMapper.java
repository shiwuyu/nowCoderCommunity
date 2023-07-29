package com.nowcoder.community.dao;

import com.nowcoder.community.entity.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Program: community
 * @Description: 评论表Comment映射
 * @Author: 张非凡
 * @Create: 2023-07-14 10:46
 */
@Mapper
public interface CommentMapper {

    /**
     * 通过实体查找评论
     * @param entityType
     * @param entityId
     * @param offset
     * @param limit
     * @return
     */
    List<Comment> selectCommentsByEntity(int entityType, int entityId, int offset, int limit);

    /**
     * 通过实体类查找评论数量
     * @param entityType
     * @param entityId
     * @return
     */
    int selectCountByEntity(int entityType, int entityId);

    /**
     * 增加新评论数据
     * @param comment
     * @return
     */
    int insertComment(Comment comment);

}
