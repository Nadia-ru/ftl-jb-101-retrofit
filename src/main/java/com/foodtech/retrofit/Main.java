package com.foodtech.retrofit;

import com.foodtech.retrofit.request.AlbumCreateRequest;
import com.foodtech.retrofit.request.AlbumUpdateRequest;
import com.foodtech.retrofit.request.PostCreateRequest;
import com.foodtech.retrofit.request.PostUpdateRequest;
import com.foodtech.retrofit.response.AlbumResponse;
import com.foodtech.retrofit.response.CommentResponse;
import com.foodtech.retrofit.response.PostResponse;
import com.foodtech.retrofit.response.UserResponse;
import lombok.Setter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;

public class Main{
    public static void main(String[] args) throws IOException {

//        System.out.println("START");
        JsonPlaceholderApi api = JsonPlaceholderService.getInstance().getJSONApi();
//
//        System.out.println("____POSTS______");
//        List<PostResponse> posts = api.posts(null).execute().body();
//         posts = api.posts(1).execute().body();
//
//        System.out.println(posts.toString());
//
//        System.out.println("__POST CREATE_____");
//        PostResponse postCreate = api.postCreate(PostCreateRequest.builder()
//                .userId(3)
//                .title("New POst")
//                .body("News")
//                .build()).execute().body();
//        System.out.println(postCreate);
//
//        System.out.println("__POST UPDATE____");
//        PostResponse postUpdate = api.postUpdate(1, PostUpdateRequest.builder()
//                .id(1)
//                .userId(3)
//                .title("New POst")
//                .body("News")
//                .build()).execute().body();
//        System.out.println(postUpdate);
//
//        System.out.println("__POST DELETE___");
//        Boolean postDelete = api.postDelete(1).execute().isSuccessful();
//        System.out.println(postDelete);
//
//        System.out.println("__POST with id___");
//        PostResponse postWithId = api.postWithId(1).execute().body();
//        System.out.println(postWithId);
//
//        System.out.println("____POST Comments______");
//        List<CommentResponse> commentResponse = api.postComments(1).execute().body();
//        System.out.println(commentResponse.toString());
//
//        System.out.println("____users______");
//        List<UserResponse> userResponses = api.users().execute().body();
//        System.out.println(userResponses.toString());
//
//        System.out.println("____user albums______");
//        List<AlbumResponse> albumsResponserByUser = api.userAlbums(1).execute().body();
//        System.out.println(albumsResponserByUser.toString());
//
//        Call<List<CommentResponse>> commentsCall = api.postComments(1);
//        Response<List<CommentResponse>> commentsCallResponse = commentsCall.execute();
//        if(commentsCallResponse.isSuccessful() && commentsCallResponse.code() == 200){
//            List<CommentResponse> responses = commentsCallResponse.body();
//        }else{
//            if(commentsCallResponse.code() == 400){
//                String error = commentsCallResponse.errorBody().string();
//            }else if(commentsCallResponse.code() == 500){
//                String error = commentsCallResponse.errorBody().string();
//            }else if(commentsCallResponse.code() == 403){
//                String error = commentsCallResponse.errorBody().string();
//            }
//        }
//
//        for(int i =0;i<100;i++) {
//            api.postComments(1).enqueue(new Callback<List<CommentResponse>>() {
//                public void onResponse(Call<List<CommentResponse>> call, Response<List<CommentResponse>> response) {
//                    List<CommentResponse> commentAsyncResponse = response.body();
//                }
//
//                public void onFailure(Call<List<CommentResponse>> call, Throwable throwable) {
//                    throwable.printStackTrace();
//                }
//            });
//        }
//
//        System.out.println("passed");
        System.out.println("__ALBUMS__");
        List<AlbumResponse> albumRes = api.albums().execute().body();
        System.out.println(albumRes);

        System.out.println("__ALBUM with id___");
        AlbumResponse albumWithId = api.albumWithId(1).execute().body();
        System.out.println(albumWithId);

       System.out.println("_ALBUM CREATE_____");
        AlbumResponse albumCreate = api.albumCreate(AlbumCreateRequest.builder()
                .title("Kitten")
                .userId(3)
                .build()).execute().body();
        System.out.println(albumCreate);

        System.out.println("_ALBUM UPDATE____");
        AlbumResponse albumUpdate = api.albumUpdate(1, AlbumUpdateRequest.builder()
                .id(1)
                .title("NEW")
                .userId(9)
                .build()).execute().body();
        System.out.println(albumUpdate);

        System.out.println("__Album DELETE___");
        Boolean albumDelete = api.albumDelete(2).execute().isSuccessful();
        System.out.println(albumDelete);
    }
}
