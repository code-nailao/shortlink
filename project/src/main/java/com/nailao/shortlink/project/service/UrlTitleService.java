package com.nailao.shortlink.project.service;

/**
 * URL 标题接口层
 *
 * @author nailao
 * @date 2024/7/14 12:22
 */
public interface UrlTitleService {

    /**
     * 根据 URL 获取标题
     *
     * @param url 目标网站地址
     * @return 网站标题
     */
    String getTitleByUrl(String url);
}
