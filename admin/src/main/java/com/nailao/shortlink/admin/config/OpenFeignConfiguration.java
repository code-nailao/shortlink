package com.nailao.shortlink.admin.config;

import com.nailao.shortlink.admin.common.biz.user.UserContext;
import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * openFeign 微服务调用传递用户信息配置
 *
 * @author nailao
 * @date 2024/7/14 14:15
 */
@Configuration
public class OpenFeignConfiguration {

    @Bean
    public RequestInterceptor requestInterceptor() {
        return template -> {
            template.header("username", UserContext.getUsername());
            template.header("userId", UserContext.getUserId());
            template.header("realName", UserContext.getRealName());
        };
    }
}
