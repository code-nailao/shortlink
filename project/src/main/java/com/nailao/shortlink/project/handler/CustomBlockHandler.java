package com.nailao.shortlink.project.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.nailao.shortlink.project.dto.req.ShortLinkCreateReqDTO;
import com.nailao.shortlink.project.dto.resp.ShortLinkCreateRespDTO;
import com.nailao.shortlink.project.common.convention.result.Result;

/**
 * 自定义流控策略
 *
 * @author nailao
 * @date 2024/7/14 10:34
 */
public class CustomBlockHandler {

    public static Result<ShortLinkCreateRespDTO> createShortLinkBlockHandlerMethod(ShortLinkCreateReqDTO requestParam, BlockException exception) {
        return new Result<ShortLinkCreateRespDTO>().setCode("B100000").setMessage("当前访问网站人数过多，请稍后再试...");
    }
}
