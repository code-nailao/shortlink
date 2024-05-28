package com.nailao.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nailao.shortlink.admin.dao.entity.UserDO;
import com.nailao.shortlink.admin.dto.resp.UserRespDTO;

/**
 * 用户接口层
 *
 * @author nailao
 * @date 2024/5/28 21:42
 */
public interface UserService extends IService<UserDO> {

    /**
     * 根据用户名查询用户信息
     *
     * @param username 用户名
     * @return 用户返回实体
     */
    UserRespDTO getUserByUsername(String username);

}
