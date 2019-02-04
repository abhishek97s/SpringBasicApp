package com.cg.dto;

import java.util.Arrays;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class RegisterDto {
	//@NotEmpty(message="Mandatory")
	private String uname;
	private String pwd;
	private String confirmPassword;
	@NotEmpty(message="Mandatory")
	@Pattern(regexp="[A-Z][a-z]*")
	private String firstName;
	private String lastName;
	@Email(message="invalid email id")
	private String email;
	private String[] skillSet;
	private char gender;
	private String city;
	public RegisterDto() {	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String[] getSkillSet() {
		return skillSet;
	}
	public void setSkillSet(String[] skillSet) {
		this.skillSet = skillSet;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "RegisterDto [uname=" + uname + ", pwd=" + pwd + ", confirmPassword=" + confirmPassword + ", firstName="
				+ firstName + ", lastName=" + lastName + ", email=" + email + ", skillSet=" + Arrays.toString(skillSet)
				+ ", gender=" + gender + ", city=" + city + "]";
	}
}
