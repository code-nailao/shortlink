package com.nailao.shortlink.project.dto.req;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.nailao.shortlink.project.dao.entity.ShortLinkDO;
import lombok.Data;

/**
 * 短链接分页请求参数
 *
 * @author nailao
 * @date 2024/6/11 19:52
 */
@Data
public class ShortLinkPageReqDTO extends Page<ShortLinkDO> {

    /**
     * 分组标识
     */
    private String gid;

    /**
     * 排序标识
     */
    private String orderTag;
}
