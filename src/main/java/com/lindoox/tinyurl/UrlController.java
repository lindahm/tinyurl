package com.lindoox.tinyurl;

import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import org.springframework.util.function.ThrowingConsumer;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class UrlController {

    private UrlService urlService;

    @PostMapping("/shorten")
    public void shorten(@RequestBody String longUrl) {

    }

    @GetMapping("/{hash}")
    public void get(final HttpServletResponse response, final @PathVariable String hash) {
        urlService.getUrlBy(hash).ifPresentOrElse(
                ThrowingConsumer.of(url -> response.sendRedirect(url.getLongUrl())),
                UrlNotFoundException::new);
    }

}
