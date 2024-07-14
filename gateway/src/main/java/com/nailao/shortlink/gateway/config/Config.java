package com.nailao.shortlink.gateway.config;

import lombok.Data;

import java.util.List;

/**
 * 过滤器配置
 *
 * @author nailao
 * @date 2024/7/14 12:40
 */
@Data
public class Config {

    /**
     * 白名单前置路径
     */
    private List<String> whitePathList;
}
