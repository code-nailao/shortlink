package com.nailao.shortlink.admin.dto.req;

import lombok.Data;

/**
 * 用户登录请求参数
 *
 * @author nailao
 * @date 2024/5/29 21:51
 */
@Data
public class UserLoginReqDTO {

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;
}
