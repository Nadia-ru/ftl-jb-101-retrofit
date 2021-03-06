package com.foodtech.retrofit;

import com.foodtech.retrofit.request.*;
import com.foodtech.retrofit.response.AlbumResponse;
import com.foodtech.retrofit.response.CommentResponse;
import com.foodtech.retrofit.response.PostResponse;
import com.foodtech.retrofit.response.UserResponse;
import retrofit2.Call;
import retrofit2.http.*;


import java.util.List;

public interface JsonPlaceholderApi {

    @GET("/posts")
    Call<List<PostResponse>> posts(@Query("userId") Integer userId);
    @POST("/posts")
    Call<PostResponse> postCreate(@Body PostCreateRequest request);
    @PUT("/posts/{id}")
    Call<PostResponse> postUpdate(@Path ("id") Integer id, @Body PostUpdateRequest request);
    @DELETE("/posts/{id}")
    Call<Void> postDelete(@Path ("id") Integer id);
    @GET("/posts/{id}")
    Call<PostResponse> postWithId(@Path ("id") Integer id);
    @GET("/posts/{id}/comments")
    Call<List<CommentResponse>> postComments(@Path ("id") Integer id);


    @GET("/users")
    Call<List<UserResponse>> users();
    @GET("/users/{id}")
    Call<UserResponse> userWithId(@Path ("id") Integer id);
    @GET("/users/{userId}/albums")
    Call<List<AlbumResponse>> userAlbums(@Path("userId") Integer userId);
    @POST("/users")
    Call<UserResponse> userCreate(@Body UserCreateRequest request);
    @PUT("/users/{id}")
    Call<UserResponse> userUpdate(@Path ("id") Integer id, @Body UserUpdateRequest request);
    @DELETE("/users/{id}")
    Call<Void> userDelete(@Path ("id") Integer id);


    @GET("/albums")
    Call<List<AlbumResponse>> albums();
    @GET("/albums/{id}")
    Call<AlbumResponse> albumWithId(@Path ("id") Integer id);
    @POST("/albums")
    Call<AlbumResponse> albumCreate(@Body AlbumCreateRequest request);
    @PUT("/albums/{id}")
    Call<AlbumResponse> albumUpdate(@Path ("id") Integer id, @Body AlbumUpdateRequest request);
    @DELETE("/albums/{id}")
    Call<Void> albumDelete(@Path ("id") Integer id);
}
