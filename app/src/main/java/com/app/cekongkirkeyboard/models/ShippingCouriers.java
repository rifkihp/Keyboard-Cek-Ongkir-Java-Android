package com.app.cekongkirkeyboard.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Comparator;

public class ShippingCouriers implements Serializable {

    static final long serialVersionUID = 1L;

    @SerializedName("code")
    public String code = "";

    @SerializedName("name")
    public String name = "";

    @SerializedName("service")
    public String service = "";

    @SerializedName("cost")
    public String cost = "";

    @SerializedName("currency")
    public String currency = "";

    @SerializedName("description")
    public String description = "";

    @SerializedName("value")
    public String value = "";

    @SerializedName("etd")
    public String etd = "";

    @SerializedName("note")
    public String note = "";

    public boolean is_checked = false;

    public ShippingCouriers(String code, String name, String service, String cost, String currency, String description, String value, String etd, String note) {
        this.code = code;
        this.name = name;
        this.service = service;
        this.cost = cost;
        this.currency = currency;
        this.description = description;
        this.value = value;
        this.etd = etd;
        this.note = note;
        this.is_checked = false;
    }


    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public String getService() {
        return this.service;
    }

    public String getCost() {
        return this.cost;
    }

    public String getCurrency() {
        return this.currency;
    }

    public String getDescription() {
        return this.description;
    }

    public String getValue() {
        return this.value;
    }

    public String getEtd() {
        return this.etd;
    }

    public String getNote() {
        return this.note;
    }

    public Boolean getChecked() {
        return this.is_checked;
    }

    public void setChecked(boolean checked) {
        this.is_checked = checked;
    }

    public static Comparator<ShippingCouriers> COMPARE_BY_COST = new Comparator<ShippingCouriers>() {
        public int compare(ShippingCouriers couriers1, ShippingCouriers couriers2) {
            int cost1 = 0;

            if (!couriers1.value.equals("")) {
                cost1 = Integer.parseInt(couriers1.value);
            }

            int cost2 = 0;
            if (!couriers2.value.equals("")) {
                cost2 = Integer.parseInt(couriers2.value);
            }

            return cost1 - cost2;
        }
    };

    public static Comparator<ShippingCouriers> COMPARE_BY_CODE = new Comparator<ShippingCouriers>() {
        public int compare(ShippingCouriers couriers1, ShippingCouriers couriers2) {
            return couriers1.code.compareTo(couriers2.code);
        }
    };

}
