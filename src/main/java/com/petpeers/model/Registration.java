package com.petpeers.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "tbl_user_registration")
@NamedQueries({
	@NamedQuery(name = "findLoginByUserName",query = "from Registration r where r.userName =:userName")
})
public class Registration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	@NotEmpty(message = "Should Not Be Empty")
	@Column(name = "user_name")
	private String userName;
	@NotEmpty(message = "Should Not Be Empty")
	@Column(name = "password")
	private String password;
	@NotEmpty(message = "Should Not Be Empty")
	@Column(name = "confirm_password")
	private String cpassword;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	@Override
	public String toString() {
		return "Registration [userId=" + userId + ", userName=" + userName + ", password=" + password + ", cpassword="
				+ cpassword + "]";
	}
	
	
	

}
