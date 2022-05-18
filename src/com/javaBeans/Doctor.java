package com.javaBeans;

public class Doctor extends User {
	private String specialty;
	private int id_cabnet;

	public Doctor(int id,String cin, String firstName, String lastName, String phone,String specialty ,String email, String password,String adress) {
		super(id,cin, firstName, lastName, phone, email, password, adress);
		this.specialty=specialty;
	}
	
	public String getSpecialty() {
		return specialty;
	}
	
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public int getId_cabnet() {
		return id_cabnet;
	}

	public void setId_cabnet(int id_cabnet) {
		this.id_cabnet = id_cabnet;
	}
}
