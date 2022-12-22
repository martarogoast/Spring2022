package ejercicio3hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee") 
class Employee {
	
	@Column(name = "id") 
	@Id
	private long id;
	@Column (name = "name")
	private String name;
	
	//Getters - Setters
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
