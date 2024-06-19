package com.nailao.shortlink.project.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.nailao.shortlink.project.dao.entity.ShortLinkDO;
import com.nailao.shortlink.project.dto.req.ShortLinkCreateReqDTO;
import com.nailao.shortlink.project.dto.req.ShortLinkPageReqDTO;
import com.nailao.shortlink.project.dto.resp.ShortLinkCreateRespDTO;
import com.nailao.shortlink.project.dto.resp.ShortLinkPageRespDTO;

/**
 * 短链接接口层
 *
 * @author nailao
 * @date 2024/6/11 17:13
 */
public interface ShortLinkService extends IService<ShortLinkDO> {

    /**
     * 创建短链接
     *
     * @param requestParam 创建短链接请求参数
     * @return 短链接创建信息
     */
    ShortLinkCreateRespDTO createShortLink(ShortLinkCreateReqDTO requestParam);

    /**
     * 分页查询短链接
     *
     * @param requestParam 分页查询短链接请求参数
     * @return 短链接分页返回结果
     */
    IPage<ShortLinkPageRespDTO> pageShortLink(ShortLinkPageReqDTO requestParam);
}
