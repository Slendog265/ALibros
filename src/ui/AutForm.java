package ui;

import java.util.Scanner;

import dol.Autor;

public class AutForm {
Scanner entry = new Scanner(System.in);
Autor a = new Autor();
	public void AutForm() {
		System.out.println("Nombre del Autor?");
		a.setName(entry.next());
		System.out.println("PseudoNombre del Autor");
		a.setPseudoName(entry.next());
		System.out.println("Nacionalidad del Autor");
		a.setNationality(entry.next());
		
		return ;
		
	}
	
	
	
}
