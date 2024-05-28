package com.nailao.shortlink.admin.common.convention.errorcode;

/**
 * 平台错误码
 *
 * @author nailao
 * @date 2024/5/28 22:44
 */
public interface IErrorCode {

    /**
     * 错误码
     */
    String code();

    /**
     * 错误信息
     */
    String message();
}
