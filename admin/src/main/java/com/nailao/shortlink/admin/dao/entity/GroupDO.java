package com.nailao.shortlink.admin.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.nailao.shortlink.admin.database.BaseDO;
import lombok.Data;

/**
 * 短链接分组实体
 *
 * @author nailao
 * @date 2024/6/7 18:30
 */
@Data
@TableName("t_group")
public class GroupDO extends BaseDO {

    /**
     * id
     */
    private Long id;

    /**
     * 分组标识
     */
    private String gid;

    /**
     * 分组名称
     */
    private String name;

    /**
     * 创建分组用户名
     */
    private String username;

    /**
     * 分组排序
     */
    private Integer sortOrder;
}
