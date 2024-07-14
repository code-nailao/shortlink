package com.nailao.shortlink.project.dto.resp;

import lombok.Data;

/**
 * 短链接分组查询返回参数
 * 
 * @author nailao
 * @date 2024/6/19 15:35
 */
@Data
public class ShortLinkGroupCountQueryRespDTO {

    /**
     * 分组标识
     */
    private String gid;

    /**
     * 短链接数量
     */
    private Integer shortLinkCount;
}
