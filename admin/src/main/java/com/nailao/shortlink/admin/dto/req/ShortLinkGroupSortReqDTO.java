package com.nailao.shortlink.admin.dto.req;

import lombok.Data;

/**
 * 短链接分组排序参数
 *
 * @author nailao
 * @date 2024/6/10 15:18
 */
@Data
public class ShortLinkGroupSortReqDTO {

    /**
     * 分组ID
     */
    private String gid;

    /**
     * 排序
     */
    private Integer sortOrder;
}
