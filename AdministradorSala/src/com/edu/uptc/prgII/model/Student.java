package com.edu.uptc.prgII.model;

import java.io.Serializable;

/**
 * 
 * @author Andres Barrera, Javier Lopez y Diego Patiño.
 *
 */
public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private transient String code;
	private String firtsName;
	private String lastName;

	/**
	 * 
	 * @param code
	 * @param firtsName
	 * @param lastName
	 */
	public Student(String code, String firtsName, String lastName) {
		super();
		this.code = code;
		this.firtsName = firtsName;
		this.lastName = lastName;
	}

	/**
	 * 
	 * @return
	 */
	public String getCode() {
		return code;
	}

	/**
	 * 
	 * @param code
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * 
	 * @return
	 */
	public String getFirtsName() {
		return firtsName;
	}

	/**
	 * 
	 * @param firtsName
	 */
	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}

	/**
	 * 
	 * @return
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
