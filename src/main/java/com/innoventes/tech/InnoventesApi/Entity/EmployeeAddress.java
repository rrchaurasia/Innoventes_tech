package com.innoventes.tech.InnoventesApi.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Employee_Address")
public class EmployeeAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@ManyToOne
	@JoinColumn(name = "empId", insertable = false, updatable = false)
	private Employee employee;

	@ManyToOne
	@JoinColumn(name = "addId", insertable = false, updatable = false)
	private Address address;

	@Column
	private String addressType;

	public EmployeeAddress() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeAddress(Employee employee, Address address, String addressType) {
		super();
		this.employee = employee;
		this.address = address;
		this.addressType = addressType;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return String.format("EmployeeAddress [id=%s, employee=%s, address=%s, addressType=%s]", id, employee, address,
				addressType);
	}
	
	

}
