package ui;

import java.util.Scanner;

import dol.Book;

public class BookForm {

		Scanner entry = new Scanner(System.in);
		Book b = new Book();
			public void BooForm() {
				System.out.println("Titulo del Libro");
				b.setTitle(entry.next());
				System.out.println("Editorial del Libro");
				b.setEdito(entry.next());
				System.out.println("Edicion");
				b.setEdition(entry.next());
				System.out.println("Año de Publicacion del Libro");
				b.setYearPub(entry.next());
				return ;
				
			}
}
