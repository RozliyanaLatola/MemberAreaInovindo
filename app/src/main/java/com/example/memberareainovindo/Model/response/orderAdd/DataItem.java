package com.example.memberareainovindo.Model.response.orderAdd;

import com.google.gson.annotations.SerializedName;

public class DataItem{

	@SerializedName("mulai_p")
	private String mulaiP;

	@SerializedName("selesai_p")
	private String selesaiP;

	@SerializedName("id_domain")
	private int idDomain;

	@SerializedName("lama_domain")
	private String lamaDomain;

	@SerializedName("id_customers")
	private int idCustomers;

	@SerializedName("id_price")
	private int idPrice;

	@SerializedName("updated_at")
	private Object updatedAt;

	@SerializedName("created_at")
	private Object createdAt;

	@SerializedName("id")
	private int id;

	@SerializedName("project_name")
	private String projectName;

	@SerializedName("lama_p")
	private String lamaP;

	public String getMulaiP(){
		return mulaiP;
	}

	public String getSelesaiP(){
		return selesaiP;
	}

	public int getIdDomain(){
		return idDomain;
	}

	public String getLamaDomain(){
		return lamaDomain;
	}

	public int getIdCustomers(){
		return idCustomers;
	}

	public int getIdPrice(){
		return idPrice;
	}

	public Object getUpdatedAt(){
		return updatedAt;
	}

	public Object getCreatedAt(){
		return createdAt;
	}

	public int getId(){
		return id;
	}

	public String getProjectName(){
		return projectName;
	}

	public String getLamaP(){
		return lamaP;
	}
}