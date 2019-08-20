package com.pkg1;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name="M2OHobby")
public class Hobby {
	
	@Id
	@GeneratedValue
	@Column(name="Hobbies_id")
	private int id;
	private String hobbies;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="HUMAN_ID")
	private Human human;
	
	
	public Human getHuman() {
		return human;
	}
	public void setHuman(Human human) {
		this.human = human;
	}
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Hobby [id=" + id + ", hobbies=" + hobbies + ", human=" + human + "]";
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
	
	
}
