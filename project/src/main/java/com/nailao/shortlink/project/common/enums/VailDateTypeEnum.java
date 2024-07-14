package com.nailao.shortlink.project.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 有效期类型
 *
 * @author nailao
 * @date 2024/7/8 15:06
 */
@RequiredArgsConstructor
public enum VailDateTypeEnum {

    /**
     * 永久有效期
     */
    PERMANENT(0),

    /**
     * 自定义有效期
     */
    CUSTOM(1);

    @Getter
    private final int type;
}
