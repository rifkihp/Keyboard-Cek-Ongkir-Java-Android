package com.app.cekongkirkeyboard.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class RajaOngkirCouriersServicesCosts implements Serializable {

    static final long serialVersionUID = 1L;

    @SerializedName("value")
    int value;

    @SerializedName("etd")
    String etd;

    @SerializedName("note")
    String note;

    public int getValue() {
        return this.value;
    }

    public String getEtd() {
        return this.etd;
    }

    public String getNote() {
        return this.note;
    }

}
