package com.example.viewpager.API;

import com.example.viewpager.Model.Image;

import retrofit.Call;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

public interface apiInterface {
    @FormUrlEncoded
    @POST("api/v1/banner_images")
    Call<Image> getImages();

}
