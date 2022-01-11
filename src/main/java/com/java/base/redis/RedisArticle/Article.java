package com.java.base.redis.RedisArticle;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
@Builder
public class Article implements Serializable {
    private String title;
    private String dec;
    private String content;

}
