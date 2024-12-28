package com.app.cekongkirkeyboard.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class RajaOngkirCity implements Serializable {

    static final long serialVersionUID = 1L;

    @SerializedName("results")
    private ArrayList<cities> results;

    public ArrayList<cities> getResults() {
        return this.results;
    }

}
