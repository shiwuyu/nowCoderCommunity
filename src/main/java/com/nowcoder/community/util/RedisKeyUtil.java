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

    // 某个实体的赞
    /**
     * @description: like:entity:entityType:entityId -> set(userId)
     * @param:
     * @return:
     */
    public static String getEntityLikeKey(int entityType, int entityId) {
        return PREFIX_ENTITY_LIKE + SPLIT + entityType + SPLIT + entityId;
    }
}
