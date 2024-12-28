package com.app.cekongkirkeyboard.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class RajaOngkirCost implements Serializable {

    static final long serialVersionUID = 1L;

    @SerializedName("results")
    private ArrayList<RajaOngkirCouriers> results;

    public ArrayList<RajaOngkirCouriers> getResults() {
        return this.results;
    }

}
