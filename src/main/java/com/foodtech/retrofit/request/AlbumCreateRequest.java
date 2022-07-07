package com.foodtech.retrofit.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
public class AlbumCreateRequest {
    private int userId;
    private String title;
}
