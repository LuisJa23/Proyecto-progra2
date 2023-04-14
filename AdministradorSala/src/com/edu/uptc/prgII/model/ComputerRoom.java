package com.edu.uptc.prgII.model;

import java.util.ArrayList;

/**
 * 
 * @author Andres Barrera, Javier Lopez y Diego Patiño
 *
 */
public class ComputerRoom {
	private ArrayList<Computer> computers;

	/**
	 * 
	 */
	public ComputerRoom() {
		super();
		this.computers = new ArrayList<>();
	}

	/**
	 * 
	 * @return
	 */
	public ArrayList<Computer> getComputers() {
		return computers;
	}
	public int size() {
		return computers.size();
	}
	/**
	 * 
	 * @return
	 */
	public String activeComputers() {
		int size = 10;
		String list = "";
		int id = 100;
		computers = new ArrayList<Computer>();
		for (int i = 0; i < size; i++, id++) {
			computers.add(new Computer(false, id));
			if (computers.get(i).isState() == false) {
				computers.get(i).setState(false);
				list += (i + 1) + ". " + computers.get(i).toString() + " Disponible " + "\n";
			} else {
				list += (i + 1) + ". " + computers.get(i).toString() + " Disponible " + "\n";
			}
		}
		return list;
	}

	/**
	 * 
	 * @param code
	 * @return
	 */
	public void takeComputers(int code) {
		for (int i = 0; i < computers.size(); i++) {
			if (computers.get(i).getId() == code) {
				computers.get(i).setState(true);
			}
		}
	}
}
