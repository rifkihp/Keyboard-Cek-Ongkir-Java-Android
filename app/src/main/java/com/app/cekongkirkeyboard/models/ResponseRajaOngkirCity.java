package com.app.cekongkirkeyboard.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ResponseRajaOngkirCity implements Serializable {

	static final long serialVersionUID = 1L;

	@SerializedName("rajaongkir")
	private RajaOngkirCity rajaongkir;

	public RajaOngkirCity getRajaongkir() {
		return rajaongkir;
	}
}