package com.edu.uptc.prgII.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * 
 * @author Andres Barrera, Javier Lopez y Diego Patiño
 *
 */
public class Persistence {
	/**
	 * 
	 * @param path
	 * @return
	 * @throws IOException
	 */
	public String ReadFle(String path) throws IOException {
		File fileInput = new File(path);
		FileInputStream input = new FileInputStream(fileInput);
		byte[] containt = new byte[(int) fileInput.length()];
		input.read(containt);
		input.close();
		return new String(containt);
	}

	/**
	 * 
	 * @param finalPath
	 * @param contain
	 * @return
	 * @throws IOException
	 */
	public boolean writeFile(String finalPath, String contain) throws IOException {
		File fileInput = new File(finalPath);
		FileOutputStream Output = new FileOutputStream(fileInput);
		Output.write(contain.getBytes());
		Output.close();
		return true;
	}
	public ArrayList<Student> readInformaticsRooms() {
		ArrayList<Student> Student = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("src/Students");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            @SuppressWarnings("unchecked")
			ArrayList<Student> readObject = (ArrayList<Student>) objectInputStream.readObject();
			Student = readObject;
            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer las salas de informática.");
        }
        return Student;
    }
}
