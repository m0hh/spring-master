package com.mohamed.springmaster.jsonplaceholder;

import lombok.Data;

@Data
public class Post {
    private final Integer userId;
    private final Integer id;

    private final String title;

    private final String body;

}
