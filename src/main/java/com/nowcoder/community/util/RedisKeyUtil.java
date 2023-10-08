package com.nowcoder.community.util;

/**
 * @Program: community
 * @Description: redis工具类
 * @Author: 张非凡
 * @Create: 2023-09-27 15:02
 */
public class RedisKeyUtil {

    private static final String SPLIT = ":";
    private static final String PREFIX_ENTITY_LIKE = "like:entity";
    private static final String PREFIX_USER_LIKE = "like:user";

    /**
     * @description: 某个实体的点赞 like:entity:entityType:entityId -> set(userId)
     * @param: [entityType, entityId]
     * @return: java.lang.String
     */
    public static String getEntityLikeKey(int entityType, int entityId) {
        return PREFIX_ENTITY_LIKE + SPLIT + entityType + SPLIT + entityId;
    }

    /**
     * @description: 用户的赞: like:user:userId -> int
     * @param: [userId]
     * @return: java.lang.String
     */
    public static String getUserLikeKey(int userId) {
        return PREFIX_USER_LIKE + SPLIT + userId;
    }
}
