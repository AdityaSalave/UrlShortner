package com.example.UrlShortener.service;

import com.example.UrlShortener.model.Url;
import com.example.UrlShortener.repository.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Optional;

@Service
public class UrlShortenerService {

    @Autowired
    private UrlRepository urlRepository;

    public String shortenUrl(String originalUrl) {
        String shortUrl = Base64.getUrlEncoder()
                .encodeToString(originalUrl.getBytes(StandardCharsets.UTF_8))
                .substring(0, 8);
        Url url = new Url(originalUrl, shortUrl);
        urlRepository.save(url);
        return shortUrl;
    }
    public String getOriginalUrl(String shortUrl) {
        return urlRepository.findByShortUrl(shortUrl)
                .map(Url::getOriginalUrl)
                .orElseThrow(() -> new RuntimeException("URL not found!"));
    }

}
