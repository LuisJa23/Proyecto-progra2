package com.edu.uptc.prgII.presenter;

import java.io.File;
import java.io.IOException;

import com.edu.uptc.prgII.model.Computer;
import com.edu.uptc.prgII.model.ComputerRoom;
import com.edu.uptc.prgII.model.Persistence;
import com.edu.uptc.prgII.model.Student;
import com.edu.uptc.prgII.model.Teacher;
import com.edu.uptc.prgII.view.Viewer;

public class Presenter {
	public static ComputerRoom ComputerRoom = new ComputerRoom();
	public static Computer computer;
	public static Viewer view = new Viewer();
	public static Persistence dataBase = new Persistence();

	public static void MENU() throws IOException {
		view.showMessage("Escoja tipo de usuatio. ");
		String MENUDESP1 = "1. Estudiante \n2. Pofesor. \n3. Salir.";
		int optionMN1 = Integer.parseInt(view.readString(MENUDESP1));
		switch (optionMN1) {
		case 1: {
			String MENUDESP2 = "1. Crear usuario. \n2. Iniciar Secion. \n3. Volver atras. ";
			int optionMN2 = Integer.parseInt(view.readString(MENUDESP2));
			switch (optionMN2) {
			case 1: {
				String code = view.readString("Ingrese codigo de estudiante.");
				String firtsName = view.readString("Ingrese primer nombre del estudiante.");
				String lastsName = view.readString("Ingrese primer apellido del estudiante.");
				Student student = new Student(code, firtsName, lastsName);
				String user = student.getFirtsName() + "." + student.getLastName() + student.getCode();
				dataBase.writeFile("src/Students/" + user + ".txt", student.toString());
				view.showMessage("Usuario creado exitosamente");
				MENU();
				break;
			}
			case 2:
				String userAsk = view.readString("Ingrese Usuario");
				File files = new File("src/Students/");
				File[] folderfiles = files.listFiles();
				for (int i = 0; i < folderfiles.length; i++) {
					if (folderfiles[i].getName().equals(userAsk + ".txt")) {
						view.showMessage(ComputerRoom.activeComputers());
						int code = Integer.parseInt(view.readString("Ingrese codigo de computador que desea"));
						for (int j = 0; j < ComputerRoom.size(); j++) {
							if (ComputerRoom.getComputers().get(j).getId() == code) {
								ComputerRoom.takeComputers(code);
								// String studentout= dataBase.ReadFle("src/Students/"+userAsk+".txt");
								Student student = dataBase.readInformaticsRooms().get(i);
								computer = new Computer(student);
							} else {
								view.showMessage("Codigo incorrecto o computador no disponible");
								view.showMessage(MENUDESP2);
							}
						}
						view.showMessage("Computador tomado exitosa mente");
						ComputerRoom.activeComputers();
					} else {
						view.showMessage("Usuario incorrecto");
						MENU();
					}
				}
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + optionMN2);
			}
			break;
		}
		case 2:
			String MENUDESP3 = "1. Crear usuario. \n2. Iniciar Secion. \n3. Volver atras. ";
			int optionMN3 = Integer.parseInt(view.readString(MENUDESP3));
			switch (optionMN3) {
			case 1: {
				String code = view.readString("Ingrese codigo de docente.");
				String userName = view.readString("Ingrese UserName");
				String pansword = view.readString("Ingrese contraseña");
				String firtsName = view.readString("Ingrese primer nombre del estudiante.");
				String lastsName = view.readString("Ingrese primer apellido del estudiante.");
				Teacher teacher = new Teacher(code, userName, pansword, firtsName, lastsName);
				dataBase.writeFile("src/Teacher/"+ userName+".txt", teacher.toString());
				view.showMessage("Guardado exitozamente.");
				MENU();
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + optionMN3);
			}

		default:
			throw new IllegalArgumentException("Unexpected value: " + optionMN1);
		}

	}

	public static void main(String[] args) throws IOException {
		MENU();
	}
}
