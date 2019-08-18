package com.pkg1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="O2MHobby")
public class Hobby {
	
	@Id
	@GeneratedValue
	@Column(name="Hobbies_id")
	private int id;
	private String hobbies;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	@Override
	public String toString() {
		return "Hobby [id=" + id + ", hobbies=" + hobbies + "]";
	}
	
}
