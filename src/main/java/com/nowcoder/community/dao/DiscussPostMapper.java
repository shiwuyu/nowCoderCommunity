package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Program: community
 * @Description: 评论表映射
 * @Author: 张非凡
 * @Create: 2023-07-14 10:46
 */
@Mapper
public interface DiscussPostMapper {

    /**
     * 查找评论
     * @param userId
     * @param offset
     * @param limit
     * @return
     */
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    // @Param注解用于给参数去别名
    // 如果只有一个参数， 并且在<if>里使用，就必须加别名.

    /**
     * 查找行数
     * @param userId
     * @return
     */
    int selectDiscussPostRows(@Param("userId") int userId);

    /**
     * 插入新界面
     * @param discussPost
     * @return
     */
    int insertDiscussPost(DiscussPost discussPost);

    /**
     * 通过id查找DiscussPost
     * @param id
     * @return
     */
    DiscussPost selectDiscussPostById(int id);

    /**
     * 修改帖子的评论数
     * @param id
     * @param commentCount
     * @return
     */
    int updateCommentCount(int id, int commentCount);

}
