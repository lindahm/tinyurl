package com.lindoox.tinyurl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UrlService {
    private UrlRepository urlRepository;

    public Optional<Url> getUrlBy(String shortUrl) {
        return urlRepository.findUrlByShortUrl(shortUrl);
    }
}
