package com.app.cekongkirkeyboard.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class cities implements Serializable {

    static final long serialVersionUID = 1L;

    @SerializedName("city_id")
    int city_id;

    @SerializedName("province_id")
    int province_id;

    @SerializedName("province")
    String province;

    @SerializedName("type")
    String type;

    @SerializedName("city_name")
    String city_name;

    @SerializedName("postal_code")
    String postal_code;

    public int getCity_id() {
        return this.city_id;
    }

    public int getProvince_id() {
        return this.province_id;
    }

    public String getProvince() {
        return this.province;
    }

    public String getType() {
        return this.type;
    }

    public String getCity_name() {
        return this.city_name;
    }

    public String getPostal_code() {
        return this.postal_code;
    }

}
