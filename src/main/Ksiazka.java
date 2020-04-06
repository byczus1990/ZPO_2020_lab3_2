package main;

public class Ksiazka implements Publikacja{
	
	private String autor;
	private String tytul;
	private Integer iloscStron;

	public Ksiazka(String autor, String tytul, Integer iloscStron)
	{
		this.autor = autor;
		this.tytul = tytul;
		this.iloscStron = iloscStron;
	}
	
	@Override
	public String getAutor() {
		// TODO Auto-generated method stub
		return autor;
	}

	@Override
	public String getTytul() {
		// TODO Auto-generated method stub
		return tytul;
	}

	@Override
	public Integer getIloscStron() {
		// TODO Auto-generated method stub
		return iloscStron;
	}
	
	@Override
	public String toString(){
		return "|" + getAutor() + "|" + getTytul() + "|" + getIloscStron() + "|";
	}

}
