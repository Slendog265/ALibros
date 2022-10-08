package ui;

import java.util.Scanner;

import dol.Autor;

public class AutMenu {

	Scanner entry = new Scanner(System.in);
	
	AutForm AF = new AutForm();
	Autor A = new Autor();
	short op;
	public void Options1() {
		System.out.printf("Bienvenido por favor escoga una de las opciones. \n1.Agregar Autor \n2.Mostrar Autor \n3.Volver ");
	}
	
	public void Show1() {
		Options1();
		do {
			
			op = entry.nextShort();
			switch(op) {
			case 1:
				AF.AutForm();
				break;
			case 2:
				A.Show();
				break;
			case 3:
				PMenu P = new PMenu();
			P.ShowOp();
				break;
				default:
					System.out.println("Opcion Incorrecta.");
					
					break;
			}
		}while(op != 3);
		
		
		
	}
}
