package dol;

import java.util.List;

public class Autor {

	private String Name;
	private String PseudoName;
	private String Nationality;
	private List<Book> book;
	
	public Autor() {
		super();
	}

	public Autor(String name, String pseudoName, String nationality, List<Book> book) {
		super();
		Name = name;
		PseudoName = pseudoName;
		Nationality = nationality;
		this.book = book;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPseudoName() {
		return PseudoName;
	}

	public void setPseudoName(String pseudoName) {
		PseudoName = pseudoName;
	}

	public String getNationality() {
		return Nationality;
	}

	public void setNationality(String nationality) {
		Nationality = nationality;
	}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}
	
	public void Show() {
		System.out.printf("Nombre = %s \nPesudonombre = %s \nNacionalidad = %s \nLibros = %s",
				getName(),
				getPseudoName(),
				getNationality(),
				getBook());
	}
}



