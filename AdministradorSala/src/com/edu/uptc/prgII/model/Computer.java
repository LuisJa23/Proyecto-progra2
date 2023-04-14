package com.edu.uptc.prgII.model;

public class Computer {
	private int id;
	private boolean State;
	private Student studen;

	/**
	 * 
	 * @param id
	 * @param state
	 */
	public Computer(boolean state, int id, Student Student) {
		super();
		State = state;
		this.id = id;
		this.studen = Student;
	}

	public Computer(boolean state, int id) {
		super();
		this.id = id;
		State = state;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isState() {
		return State;
	}

	public void setState(boolean state) {
		State = state;
	}

	/**
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * 
	 * @return
	 */
	public Student getStuden() {
		return studen;
	}

	/**
	 * 
	 * @param studen
	 */
	public void setStuden(Student studen) {
		this.studen = studen;
	}

	@Override
	public String toString() {
		return "Computer id=" + id + ", studen=" + studen;
	}

}
