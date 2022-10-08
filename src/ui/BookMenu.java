package ui;

import java.util.Scanner;

import dol.Book;

public class BookMenu {

	Scanner entry = new Scanner(System.in);

	BookForm B = new BookForm();
	Book b = new Book();
	short op;
	public void Options2() {
		System.out.printf("Bienvenido por favor escoga una de las opciones. \n1.Agregar Libro \n2.Mostrar Libro \n3.Volver ");
	}
	
	public void Show2() {
		Options2();
		do {
			
			op = entry.nextShort();
			switch(op) {
			case 1:
			B.BooForm();
				break;
			case 2:
			b.Show();
				break;
			case 3:
				PMenu P = new PMenu();
		P.Options();
				break;
				default:
					System.out.println("Opcion Incorrecta.");
					
					break;
			}
		}while(op != 3);
		
		
		
	}
}
