package com.nailao.shortlink.admin.dto.req;

import lombok.Data;

/**
 * 回收站移除功能
 *
 * @author nailao
 * @date 2024/7/14 10:47
 */
@Data
public class RecycleBinRemoveReqDTO {

    /**
     * 分组标识
     */
    private String gid;

    /**
     * 全部短链接
     */
    private String fullShortUrl;
}
