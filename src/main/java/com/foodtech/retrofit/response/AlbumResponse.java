package com.foodtech.retrofit.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AlbumResponse {
    public int userId;
    public int id;
    public String title;
}
