package com.foodtech.retrofit.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CommentResponse {
    private int postId;
    private int id;
    private String name;
    private String email;
    private String body;
}
