package com.nailao.shortlink.admin.common.enums;

import com.nailao.shortlink.admin.common.convention.errorcode.IErrorCode;

/**
 * 用户错误码枚举
 *
 * @author nailao
 * @date 2024/5/28 22:49
 */
public enum UserErrorCodeEnum implements IErrorCode {

    USER_NULL("B000200", "用户记录不存在"),

    USER_NAME_EXIST("B000201", "用户名已存在"),

    USER_EXIST("B000202", "用户记录已存在"),

    USER_SAVE_ERROR("B000203", "用户记录新增失败");

    private final String code;

    private final String message;

    UserErrorCodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }
}
