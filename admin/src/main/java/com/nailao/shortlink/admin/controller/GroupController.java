package com.nailao.shortlink.admin.controller;

import com.nailao.shortlink.admin.service.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

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


}
