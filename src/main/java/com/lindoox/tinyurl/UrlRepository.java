package com.lindoox.tinyurl;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UrlRepository extends MongoRepository<Url, String> {
    Optional<Url> findUrlByShortUrl(String shortUrl);
}
