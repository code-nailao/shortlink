package com.nailao.shortlink.admin.dto.req;

import lombok.Data;

/**
 * 短链接分组创建参数
 *
 * @author nailao
 * @date 2024/6/7 19:26
 */
@Data
public class ShortLinkGroupSaveReqDTO {

    /**
     * 分组名
     */
    private String name;
}
