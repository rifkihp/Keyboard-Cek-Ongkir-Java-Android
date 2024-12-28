package com.app.cekongkirkeyboard.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ResponseRajaOngkirCost implements Serializable {

	static final long serialVersionUID = 1L;

	@SerializedName("rajaongkir")
	private RajaOngkirCost rajaOngkirCost;

	public RajaOngkirCost getRajaOngkirCost() {
		return rajaOngkirCost;
	}
}