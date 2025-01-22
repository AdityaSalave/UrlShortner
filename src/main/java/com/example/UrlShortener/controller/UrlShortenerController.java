package com.example.UrlShortener.controller;

//import com.example.Urlshortener.service.UrlShortenerService;
import com.example.UrlShortener.service.UrlShortenerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

    @RestController
    @RequestMapping("/api/v1/url")
    public class UrlShortenerController {

        @Autowired
        private UrlShortenerService urlShortenerService;

        @PostMapping("/shorten")
        public ResponseEntity<String> shortenUrl(@RequestBody String originalUrl) {
            return ResponseEntity.ok(urlShortenerService.shortenUrl(originalUrl));
        }

        @GetMapping("/{shortUrl}")
        public ResponseEntity<String> getOriginalUrl(@PathVariable String shortUrl) {
            return ResponseEntity.ok(urlShortenerService.getOriginalUrl(shortUrl));
        }
    }
