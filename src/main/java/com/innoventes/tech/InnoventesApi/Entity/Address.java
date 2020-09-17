package com.innoventes.tech.InnoventesApi.Entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Address implements Serializable {
	private static final long serialVersionUID = 1l;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long addId;

	@Column(nullable = false)
	private String addLineOne;

	@Column
	private String addLineTwo;

	@Column(nullable = false)
	private String city;

    @ManyToMany
    @JoinTable(name="Employee_Address",joinColumns = {@JoinColumn(name="addId")}, inverseJoinColumns = {@JoinColumn(name="empId")})
	private Set<Employee> employee = new HashSet();

	public Address(String addLineOne, String addLineTwo, String city) {
		super();
		this.addLineOne = addLineOne;
		this.addLineTwo = addLineTwo;
		this.city = city;
	}

	public Address(String addLineOne, String addLineTwo, String city, Set<Employee> employee) {
		super();
		this.addLineOne = addLineOne;
		this.addLineTwo = addLineTwo;
		this.city = city;
		this.employee = employee;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Set<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}

	

	public long getAddId() {
		return addId;
	}

	public void setAddId(long addId) {
		this.addId = addId;
	}

	public String getAddLineOne() {
		return addLineOne;
	}

	public void setAddLineOne(String addLineOne) {
		this.addLineOne = addLineOne;
	}

	public String getAddLineTwo() {
		return addLineTwo;
	}

	public void setAddLineTwo(String addLineTwo) {
		this.addLineTwo = addLineTwo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
