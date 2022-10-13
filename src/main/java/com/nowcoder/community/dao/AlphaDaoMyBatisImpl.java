package com.nowcoder.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * @program: community
 * @description: 依旧是个测试类（数据库）
 * @author: 张非凡
 * @create: 2022-09-03 21:15
 **/

@Repository("mybatis")
public class AlphaDaoMyBatisImpl implements AlphaDao {

    @Override
    public String select() {
        return "MyBatis";
    }
}
