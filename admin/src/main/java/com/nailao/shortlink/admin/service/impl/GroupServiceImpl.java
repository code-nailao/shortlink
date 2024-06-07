package com.nailao.shortlink.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nailao.shortlink.admin.dao.entity.GroupDO;
import com.nailao.shortlink.admin.dao.mapper.GroupMapper;
import com.nailao.shortlink.admin.service.GroupService;
import groovy.util.logging.Slf4j;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 短链接分组接口实现层
 *
 * @author nailao
 * @date 2024/6/7 18:36
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class GroupServiceImpl extends ServiceImpl<GroupMapper, GroupDO> implements GroupService {
}
