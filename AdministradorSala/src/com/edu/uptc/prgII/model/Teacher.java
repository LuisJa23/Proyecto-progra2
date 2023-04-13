package com.edu.uptc.prgII.model;

import java.io.Serializable;

/**
 * 
 * @author Andres Barrera, Javier Lopez y Diego Patiño.
 *
 */
public class Teacher implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private transient String id;
	private transient String userName;
	private transient String panswordUser;
	private String firtsName;
	private String lastName;

	/**
	 * 
	 * @param id
	 * @param userName
	 * @param panswordUser
	 * @param firtsName
	 * @param lastName
	 */
	public Teacher(String id, String userName, String panswordUser, String firtsName, String lastName) {
		super();
		this.id = id;
		this.userName = userName;
		this.panswordUser = panswordUser;
		this.firtsName = firtsName;
		this.lastName = lastName;
	}

	/**
	 * 
	 * @return
	 */
	public String getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 
	 * @return
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * 
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * 
	 * @return
	 */
	public String getPanswordUser() {
		return panswordUser;
	}

	/**
	 * 
	 * @param panswordUser
	 */
	public void setPanswordUser(String panswordUser) {
		this.panswordUser = panswordUser;
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

	/**
	 * 
	 * @return
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
