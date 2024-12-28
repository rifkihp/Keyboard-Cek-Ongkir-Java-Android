package com.app.cekongkirkeyboard.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class RajaOngkirCouriersServices implements Serializable {

    static final long serialVersionUID = 1L;

    @SerializedName("service")
    String service;

    @SerializedName("description")
    String description;

    @SerializedName("cost")
    ArrayList<RajaOngkirCouriersServicesCosts> cost;

    public String getService() {
        return this.service;
    }

    public String getDescription() {
        return this.description;
    }

    public ArrayList<RajaOngkirCouriersServicesCosts> getCost() {
        return this.cost;
    }

}
