package com.nailao.shortlink.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nailao.shortlink.project.dao.entity.LinkStatsTodayDO;
import com.nailao.shortlink.project.dao.mapper.LinkStatsTodayMapper;
import com.nailao.shortlink.project.service.LinkStatsTodayService;
import org.springframework.stereotype.Service;

/**
 * 短链接今日统计接口实现层
 *
 * @author nailao
 * @date 2024/7/14 12:27
 */
@Service
public class LinkStatsTodayServiceImpl extends ServiceImpl<LinkStatsTodayMapper, LinkStatsTodayDO> implements LinkStatsTodayService {
}
