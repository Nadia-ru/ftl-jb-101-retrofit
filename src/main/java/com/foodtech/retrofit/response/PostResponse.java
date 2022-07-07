package com.foodtech.retrofit.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PostResponse {
    private int userId;
    private int id;
    private String title;
    private String body;
}
