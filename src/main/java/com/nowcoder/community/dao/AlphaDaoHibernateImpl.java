package com.nowcoder.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * @program: community
 * @description: 继承实现类
 * @author: 张非凡
 * @create: 2022-09-03 20:07
 **/

@Repository
@Primary
public class AlphaDaoHibernateImpl implements AlphaDao {
    @Override
    public String select() {
        return "Hibernate";
    }
}
