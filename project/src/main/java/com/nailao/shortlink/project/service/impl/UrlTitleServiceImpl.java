package com.nailao.shortlink.project.service.impl;

import com.nailao.shortlink.project.service.UrlTitleService;
import lombok.SneakyThrows;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

import java.net.HttpURLConnection;
import java.net.URL;

/**
 * URL 标题接口实现层
 *
 * @author nailao
 * @date 2024/7/14 12:23
 */
@Service
public class UrlTitleServiceImpl implements UrlTitleService {

    @SneakyThrows
    @Override
    public String getTitleByUrl(String url) {
        URL targetUrl = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) targetUrl.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();
        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            Document document = Jsoup.connect(url).get();
            return document.title();
        }
        return "Error while fetching title.";
    }
}
