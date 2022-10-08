package ui;

import java.util.Scanner;

public class PMenu {

	Scanner entry = new Scanner(System.in);
	AutMenu A = new AutMenu();
	BookMenu B = new BookMenu();
	short op;
	public void Options() {
		System.out.printf("Bienvenido por favor escoga una de las opciones. \n1.Autor \n2.Libro \n3.Salir ");
	}
	
	public void ShowOp() {
		Options();
		do {
		
			op = entry.nextShort();
			switch(op) {
			case 1:
				A.Options1();
				break;
			case 2:
				B.Options2();
				break;
			case 3:
				System.exit(0);
				break;
				default:
					System.out.println("Opcion Incorrecta.");
					
					break;
			}
		}while(op != 3);
		
		
		
	}
}
