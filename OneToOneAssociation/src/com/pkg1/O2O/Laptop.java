package com.pkg1.O2O;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="lappy")
public class Laptop {
	@Id
	@GeneratedValue
	private int id;
	private String c_name;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="shounen_id")
	private Boy boy;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public Boy getBoy() {
		return boy;
	}
	public void setBoy(Boy boy) {
		this.boy = boy;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", c_name=" + c_name + ", boy=" + boy + "]";
	}
	
}
