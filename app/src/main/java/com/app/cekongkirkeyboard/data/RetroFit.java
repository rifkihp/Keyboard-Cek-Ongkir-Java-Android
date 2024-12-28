package com.app.cekongkirkeyboard.data;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroFit {

    private static Retrofit getRetrofit() {
        String base_url = "https://pro.rajaongkir.com/api/";

        return new Retrofit.Builder()
                .baseUrl(base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static RestApi getInstanceRetrofit() {
        return getRetrofit().create(RestApi.class);
    }

}