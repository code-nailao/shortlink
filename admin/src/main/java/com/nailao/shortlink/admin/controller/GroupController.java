package com.nailao.shortlink.admin.controller;

import com.nailao.shortlink.admin.common.convention.result.Result;
import com.nailao.shortlink.admin.common.convention.result.Results;
import com.nailao.shortlink.admin.dto.req.ShortLinkGroupSaveReqDTO;
import com.nailao.shortlink.admin.dto.resp.ShortLinkGroupRespDTO;
import com.nailao.shortlink.admin.service.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 短链接分组控制层
 *
 * @author nailao
 * @date 2024/6/7 18:38
 */
@RestController
@RequiredArgsConstructor
public class GroupController {

    private final GroupService groupService;

    /**
     * 新增短链接分组
     */
    @PostMapping("/api/short-link/admin/v1/group")
    public Result<Void> save(@RequestBody ShortLinkGroupSaveReqDTO requestParam) {
        groupService.saveGroup(requestParam.getName());
        return Results.success();
    }


    /**
     * 查询短链接分组集合
     */
    @GetMapping("/api/short-link/admin/v1/group")
    public Result<List<ShortLinkGroupRespDTO>> listGroup() {
        return Results.success(groupService.listGroup());
    }




}
