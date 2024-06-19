package com.nailao.shortlink.project.controller;

import com.alibaba.nacos.api.model.v2.Result;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.nailao.shortlink.project.common.convention.result.Results;
import com.nailao.shortlink.project.dto.req.ShortLinkCreateReqDTO;
import com.nailao.shortlink.project.dto.req.ShortLinkPageReqDTO;
import com.nailao.shortlink.project.dto.resp.ShortLinkCreateRespDTO;
import com.nailao.shortlink.project.dto.resp.ShortLinkPageRespDTO;
import com.nailao.shortlink.project.service.ShortLinkService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * @author nailao
 * @date 2024/6/11 17:20
 */
@RestController
@RequiredArgsConstructor
public class ShortLinkController {

    private final ShortLinkService shortLinkService;

    /**
     * 创建短链接
     */
    @PostMapping("/api/short-link/v1/create")
    public Result<ShortLinkCreateRespDTO> createShortLink(@RequestBody ShortLinkCreateReqDTO requestParam) {
        return Results.success(shortLinkService.createShortLink(requestParam));
    }

    /**
     * 分页查询短链接
     */
    @GetMapping("/api/short-link/v1/page")
    public Result<IPage<ShortLinkPageRespDTO>> pageShortLink(ShortLinkPageReqDTO requestParam) {
        return Results.success(shortLinkService.pageShortLink(requestParam));
    }



}

