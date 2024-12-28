package com.app.cekongkirkeyboard.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class RajaOngkirCouriers implements Serializable {

    static final long serialVersionUID = 1L;

    @SerializedName("code")
    String code;

    @SerializedName("name")
    String name;

    @SerializedName("costs")
    ArrayList<RajaOngkirCouriersServices> costs;

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<RajaOngkirCouriersServices> getCosts() {
        return this.costs;
    }

}
