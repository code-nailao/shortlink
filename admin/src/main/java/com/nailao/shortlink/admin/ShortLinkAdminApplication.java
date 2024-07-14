package com.nailao.shortlink.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 短链接后管应用
 *
 * @author yang
 * @date 2024/5/28 20:45
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.nailao.shortlink.admin.remote")
@MapperScan("com.nailao.shortlink.admin.dao.mapper")
public class ShortLinkAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShortLinkAdminApplication.class, args);
    }
}
