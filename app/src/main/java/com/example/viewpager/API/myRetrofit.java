package com.example.viewpager.API;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class myRetrofit {
    private static retrofit2.Retrofit retrofit;
    private static myRetrofit myClient;
    public static String BASE_URL = "https://mobile.bisad.ae/";

    public static synchronized myRetrofit getInstance() {
        if (myClient == null) {
            myClient = new myRetrofit();
        }
        return myClient;
    }

    public static apiInterface getMyApi(){
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(apiInterface.class);
    }
}
