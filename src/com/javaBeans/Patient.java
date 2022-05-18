package com.javaBeans;

public class Patient extends User{
	
	private String birthDate;
	private String sex;
	private MedicalFile medicalFile;
	
	public Patient() {
		
	}
	
	public Patient(int id,String cin,String firstName, String lastName, String phone,String specialty ,String email, String password, String adress) {
		super(id,cin,firstName,lastName,phone,email, password, adress);
			
	}
	
	public Patient(int id, String cin, String firstName, String lastName, String phone, String email, String password, String birthDate, String sex, String adress) {
		super(id,cin,firstName,lastName,phone,email, password, adress);
		this.birthDate = birthDate;
		this.sex = sex;
	}

	public MedicalFile getMedicalFile() {
		return medicalFile;
	}

	public void setMedicalFile(MedicalFile medicalFile) {
		this.medicalFile = medicalFile;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

}
