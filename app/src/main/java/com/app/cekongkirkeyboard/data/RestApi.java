package com.app.cekongkirkeyboard.data;

import com.app.cekongkirkeyboard.models.ResponseRajaOngkirCity;
import com.app.cekongkirkeyboard.models.ResponseRajaOngkirCost;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface RestApi {

    @Headers("key: 2da0f5e434148b73fd27b6dff889a1a3")
    @GET("city")
    Call<ResponseRajaOngkirCity> postRajaOngkirCity();

    @Headers({
            "content-type: application/x-www-form-urlencoded",
            "key: 2da0f5e434148b73fd27b6dff889a1a3"
    })
    @FormUrlEncoded
    @POST("cost")
    Call<ResponseRajaOngkirCost> postRajaOngkirCost(
            @Field("origin") String origin,
            @Field("originType") String originType,
            @Field("destination") String destination,
            @Field("destinationType") String destinationType,
            @Field("weight") String weight,
            @Field("courier") String courier
    );

}
