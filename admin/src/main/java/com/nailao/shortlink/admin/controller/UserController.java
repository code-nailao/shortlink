package com.nailao.shortlink.admin.controller;

import cn.hutool.core.bean.BeanUtil;
import com.nailao.shortlink.admin.common.convention.result.Result;
import com.nailao.shortlink.admin.common.convention.result.Results;
import com.nailao.shortlink.admin.dto.req.UserRegisterReqDTO;
import com.nailao.shortlink.admin.dto.resp.UserActualRespDTO;
import lombok.RequiredArgsConstructor;
import com.nailao.shortlink.admin.dto.resp.UserRespDTO;
import com.nailao.shortlink.admin.service.UserService;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/api/short-link/v1/user/{username}")
    public Result<UserRespDTO> getUserByUsername(@PathVariable("username") String username) {
        return Results.success(userService.getUserByUsername(username));
    }

    /**
     * 根据用户名获取用户无脱敏信息
     */
    @GetMapping("/api/short-link/v1/actual/user/{username}")
    public Result<UserActualRespDTO> getActualUserByUsername(@PathVariable("username") String username) {
        return Results.success(BeanUtil.toBean(userService.getUserByUsername(username), UserActualRespDTO.class));
    }

    @GetMapping("/api/short-link/admin/v1/user/has-username")
    public Result<Boolean> hasUsername(@RequestParam("username") String username) {
        return Results.success(userService.hasUsername(username));
    }

    /**
     * 注册用户
     */
    @PostMapping("/api/short-link/admin/v1/user")
    public Result<Void> register(@RequestBody UserRegisterReqDTO requestParam) {
        userService.register(requestParam);
        return Results.success();
    }

}
