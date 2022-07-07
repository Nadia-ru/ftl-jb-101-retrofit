package com.foodtech.retrofit.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AlbumUpdateRequest {
    private int id;
    private int userId;
    private String title;
}
