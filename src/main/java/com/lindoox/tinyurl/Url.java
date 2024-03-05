package com.lindoox.tinyurl;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document
public class Url {
    @Id
    private String Id;
    @Indexed
    @Field("short")
    private String shortUrl;
    @Field("long")
    private String longUrl;

}
