package com.cg.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import com.cg.util.MyStringDateUtil;

@Entity
@Table(name="cg_userDetails")
public class RegisterDto {
	
	@Id
	@Column(name="username", length=25)
	@NotEmpty(message="Mandatory")
	private String uname;
	@Transient
	private String pwd;
	@Transient
	private String cnfPwd;
	@Column(name="first_name", length=20)
	@NotEmpty(message="Mandatory")
	@Pattern(regexp="[A-Z][a-z]*")
	private String firstName;
	@Column(name="last_name", length=20)
	private String lastName;
	@Column(name="user_emailId", length=25)
	@Email(message="invalid email id")
	private String email;
	@Transient
	private String[] skillSet;
	@Column(name="gender", length=6)
	private char gender;
	@Column(name="user_city", length=30)
	private String city;
	@Column(name="user_skills", length=100)
	private String skillSetStr;
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
		this.setSkillSetStr(MyStringDateUtil.fromArrayToCommaSeparatedString(skillSet));
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
	public String getSkillSetStr() {
		return skillSetStr;
	}
	public void setSkillSetStr(String skillSetStr) {
		this.skillSetStr = skillSetStr;
	}
	public String getCnfPwd() {
		return cnfPwd;
	}
	public void setCnfPwd(String cnfPwd) {
		this.cnfPwd = cnfPwd;
	}
	@Override
	public String toString() {
		return "RegisterDto [uname=" + uname + ", pwd=" + pwd + ", cnfPwd=" + cnfPwd + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + ", gender=" + gender + ", city=" + city + ", skillSetStr=" + skillSetStr + "]";
	}
	
}
