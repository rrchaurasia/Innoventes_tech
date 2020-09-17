package com.innoventes.tech.InnoventesApi.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
//@NamedQuery(name="Employee.findAll",query = "select e from Employee")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","address"})
public class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5260186269976166668L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long empId;

	@Column(nullable = false)
	private String name;

	@Column
	private Date dateOfBirth;

	@ManyToMany(mappedBy = "employee",cascade =CascadeType.PERSIST , fetch = FetchType.EAGER)
	private Set<Address> address = new HashSet();

	public Employee(String name, Date dateOfBirth) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}

	public Employee(String name, Date dateOfBirth, Set<Address> address) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Set<Address> getAddress() {
		return address;
	}

	public void setAddress(Set<Address> address) {
		this.address = address;
	}

	

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
