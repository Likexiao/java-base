package com.javabase.enity;

import lombok.Data;

/**
 * The type Article.
 */
@Data
public class Article extends AbstractBase {
    private String title;
    private String dec;
    private String content;
}
