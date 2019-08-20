package com.pkg1.M2M;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Onichan")
public class Brothers {
	
	@Id
	@GeneratedValue
	@Column(name="bro_id")
	private int id;
	private String name;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="sis_id")
	private List<Sisters> listofSisters=new ArrayList<Sisters>();
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
	public List<Sisters> getListofSisters() {
		return listofSisters;
	}
	public void setListofSisters(List<Sisters> listofSisters) {
		this.listofSisters = listofSisters;
	}
	@Override
	public String toString() {
		return "Brothers [id=" + id + ", name=" + name + ", listofSisters=" + listofSisters + "]";
	}
	
}
