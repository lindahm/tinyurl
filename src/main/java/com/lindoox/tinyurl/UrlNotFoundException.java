package com.lindoox.tinyurl;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "This short URL does not exist.")
public class UrlNotFoundException extends RuntimeException {
}
