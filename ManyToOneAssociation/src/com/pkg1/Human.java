package com.pkg1;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="M2OHuman")
public class Human {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	
	
	@Override
	public String toString() {
		return "Human [id=" + id + ", name=" + name + "]";
	}


	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
