package com.edu.uptc.prgII.view;

import java.util.Scanner;

/**
 * 
 * @author Andres Barrera, Javier Lopez y Diego Patiño
 *
 */
public class Viewer {
	private Scanner console;

	/**
	 * 
	 */
	public Viewer() {
		console = new Scanner(System.in);

	}

	/**
	 * 
	 * @param message
	 * @return
	 */
	public String readString(String message) {
		showMessage(message);
		return console.nextLine();

	}

	/**
	 * 
	 * @param message
	 */
	public void showMessage(String message) {
		System.out.println(message);
	}

	public void breaker() {
		console.close();
	}
}
