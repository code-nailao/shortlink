package com.nailao.shortlink.aggregation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 短链接聚合应用
 *
 * @author nailao
 * @date 2024/7/14 15:50
 */
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {
        "com.nailao.shortlink.admin",
        "com.nailao.shortlink.project"
})
@MapperScan(value = {
        "com.nailao.shortlink.project.dao.mapper",
        "com.nailao.shortlink.admin.dao.mapper"
})
public class AggregationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AggregationServiceApplication.class, args);
    }
}