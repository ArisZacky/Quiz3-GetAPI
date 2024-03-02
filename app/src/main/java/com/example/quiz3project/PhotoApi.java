package com.example.quiz3project;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface PhotoApi {

    @GET("/photos")
    Call<List<Photos>> getPhotos();
}
