package com.nailao.shortlink.gateway.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 网关错误返回信息
 *
 * @author nailao
 * @date 2024/7/14 12:41
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GatewayErrorResult {

    /**
     * HTTP 状态码
     */
    private Integer status;

    /**
     * 返回信息
     */
    private String message;
}
