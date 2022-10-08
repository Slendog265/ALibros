package dol;

import java.util.GregorianCalendar;

public class Book {
	private String title;
	private String Edito;
	private String Edition;
	private String yearPub;
	
	public Book() {
		super();
	}

	public Book(String title, String edito, String edition, String yearPub) {
		super();
		this.title = title;
		Edito = edito;
		Edition = edition;
		this.yearPub = yearPub;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEdito() {
		return Edito;
	}

	public void setEdito(String edito) {
		Edito = edito;
	}

	public String getEdition() {
		return Edition;
	}

	public void setEdition(String edition) {
		Edition = edition;
	}

	public String getYearPub() {
		return yearPub;
	}

	public void setYearPub(String string) {
		this.yearPub = string;
	}
	
	public void Show() {
		System.out.printf("Nombre = %s \nPesudonombre = %s \nNacionalidad = %s \nLibros = %s",
				getTitle(),
				getEdito(),
				getEdition(),
				getYearPub());
	}

}
