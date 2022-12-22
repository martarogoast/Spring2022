package ejercicio4hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Usuario {
	@Column @Id
	private Long id;
	@Column
	private String firstname;
	@Column
	private String lastname;
	@Column
	private String username;
	@Column (name="user_password")
	private String password;
	@Column
	private String email;
	@Column
	private int ranking;
	@Column (name="is_admin")
	private boolean admin;
//	@Column
//	private Address domicilioParticular;
//	@Column
//	private Address domicilioTrabajo;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
//	public Address getDomicilioParticular() {
//		return domicilioParticular;
//	}
//	public void setDomicilioParticular(Address domicilioParticular) {
//		this.domicilioParticular = domicilioParticular;
//	}
//	public Address getDomicilioTrabajo() {
//		return domicilioTrabajo;
//	}
//	public void setDomicilioTrabajo(Address domicilioTrabajo) {
//		this.domicilioTrabajo = domicilioTrabajo;
//	}
}
