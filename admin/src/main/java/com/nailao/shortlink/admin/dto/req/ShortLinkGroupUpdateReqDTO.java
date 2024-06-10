package com.nailao.shortlink.admin.dto.req;

import lombok.Data;

/**
 * 短链接分组修改参数
 *
 * @author nailao
 * @date 2024/6/10 13:33
 */
@Data
public class ShortLinkGroupUpdateReqDTO {

    /**
     * 分组标识
     */
    private String gid;

    /**
     * 分组名
     */
    private String name;
}
