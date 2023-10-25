package com.nowcoder.community.util;

/**
 * @Program: community
 * @Description: redis工具类
 * @author 张非凡
 * @version 1.0.0
 * @date 2023-09-27 15:02
 */
public class RedisKeyUtil {

    private static final String SPLIT = ":";
    private static final String PREFIX_ENTITY_LIKE = "like:entity";
    private static final String PREFIX_USER_LIKE = "like:user";
    private static final String PREFIX_FOLLOWEE = "followee";
    private static final String PREFIX_FOLLOWER = "follower";
    private static final String PREFIX_KAPTCHA  = "kaptcha";
    private static final String PREFIX_TICKET = "ticket";
    private static final String PREFIX_USER = "user";

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

    /**
     * 某个用户关注的实体 followee:userId:entityType -> zset(entityId, now)
     * @param userId
     * @param entityType
     * @return: java.lang.String
     */
    public static String getFolloweeKey(int userId, int entityType) {
        return PREFIX_FOLLOWEE + SPLIT + userId + SPLIT + entityType;
    }

    /**
     * 某个用户拥有的粉丝 follower:userId:entityType -> zset(entityId, now)
     * @param userId
     * @param entityType
     * @return: java.lang.String
     */
    public static String getFollowerKey(int entityType, int entityId) {
        return PREFIX_FOLLOWER + SPLIT + entityType + SPLIT + entityId;
    }

    /**
     * 获取登录验证码
     *
     * @param owner
     * @return java.lang.String
     */
    public static String getKaptchaKey(String owner) {
        return PREFIX_KAPTCHA + SPLIT + owner;
    }

    /**
     * 获取登录凭证
     *
     * @param ticket
     * @return java.lang.String
     */
    public static String getTicketKey(String ticket) {
        return PREFIX_TICKET + SPLIT + ticket;
    }

    /**
     * 获取用户key
     *
     * @param userId
     * @return java.lang.String
     */
    public static String getUserKey(int userId) {
        return PREFIX_USER + SPLIT + userId;
    }
}
