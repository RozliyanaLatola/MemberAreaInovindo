package com.example.memberareainovindo.Model.body;

import com.google.gson.annotations.SerializedName;

public class TestimoniAddBody{

	@SerializedName("id_customers")
	private String idCustomers;

	@SerializedName("description")
	private String description;

	public String getIdCustomers(){
		return idCustomers;
	}

	public String getDescription(){
		return description;
	}

	public void setIdCustomers(String idCustomers) {
		this.idCustomers = idCustomers;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}