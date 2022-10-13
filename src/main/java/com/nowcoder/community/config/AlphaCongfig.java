package com.nowcoder.community.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

/**
 * @program: community
 * @description: 加油加油加油
 * @author: 张非凡
 * @create: 2022-09-04 10:39
 **/
@Configuration
public class AlphaCongfig {

    @Bean
    public SimpleDateFormat simpleDateFormat() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }
}
