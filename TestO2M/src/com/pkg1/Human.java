package com.pkg1;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="O2MHuman")
public class Human {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	@OneToMany(cascade=CascadeType.ALL)
	private List<Hobby> listofhobby=new ArrayList();
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
	public List<Hobby> getListofhobby() {
		return listofhobby;
	}
	public void setListofhobby(List<Hobby> listofhobby) {
		this.listofhobby = listofhobby;
	}
	@Override
	public String toString() {
		return "Human [id=" + id + ", name=" + name + ", listofhobby=" + listofhobby + "]";
	}
	
}
