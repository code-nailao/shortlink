package com.nailao.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nailao.shortlink.admin.dao.entity.GroupDO;

/**
 * 短链接分组接口层
 *
 * @author nailao
 * @date 2024/6/7 18:35
 */
public interface GroupService extends IService<GroupDO> {

    /**
     * 新增短链接分组
     *
     * @param groupName 短链接分组名
     */
    void saveGroup(String groupName);



}
