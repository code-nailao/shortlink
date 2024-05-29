package com.nailao.shortlink.admin.controller;

import cn.hutool.core.bean.BeanUtil;
import com.nailao.shortlink.admin.common.convention.result.Result;
import com.nailao.shortlink.admin.common.convention.result.Results;
import com.nailao.shortlink.admin.dto.resp.UserActualRespDTO;
import lombok.RequiredArgsConstructor;
import com.nailao.shortlink.admin.dto.resp.UserRespDTO;
import com.nailao.shortlink.admin.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户管理控制层
 * @author nailao
 * @date 2024/5/28 21:08
 */
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    /**
     * 根据用户名获取用户信息
     */
    @GetMapping("/api/shortlink/v1/user/{username}")
    public Result<UserRespDTO> getUserByUsername(@PathVariable("username") String username) {
        return Results.success(userService.getUserByUsername(username));
    }

    /**
     * 根据用户名获取用户无脱敏信息
     */
    @GetMapping("/api/shortlink/v1/actual/user/{username}")
    public Result<UserActualRespDTO> getActualUserByUsername(@PathVariable("username") String username) {
        return Results.success(BeanUtil.toBean(userService.getUserByUsername(username), UserActualRespDTO.class));
    }
}
