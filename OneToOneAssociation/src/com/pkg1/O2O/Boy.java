package com.pkg1.O2O;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SHOUNEN")
public class Boy {
	
	@Id
	@GeneratedValue
	@Column(name="shounen_id")
	private int id;
	@Column(name="shounen_name")
	private String name;
	public int getId() {
		return id;
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
	@Override
	public String toString() {
		return "Boy [id=" + id + ", name=" + name + "]";
	}
	
}
