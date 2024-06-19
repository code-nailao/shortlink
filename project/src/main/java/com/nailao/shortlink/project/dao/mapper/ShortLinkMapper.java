package com.nailao.shortlink.project.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.nailao.shortlink.project.dao.entity.ShortLinkDO;
import com.nailao.shortlink.project.dto.req.ShortLinkPageReqDTO;

/**
 * 短链接持久层
 *
 * @author nailao
 * @date 2024/6/11 17:11
 */
public interface ShortLinkMapper extends BaseMapper<ShortLinkDO> {

    IPage<ShortLinkDO> pageLink(ShortLinkPageReqDTO requestParam);
}
