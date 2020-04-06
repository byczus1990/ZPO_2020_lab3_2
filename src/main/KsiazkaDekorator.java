package main;

public abstract class KsiazkaDekorator implements Publikacja{
	protected Ksiazka dekorowanaKsiazka;
	
	public KsiazkaDekorator(Ksiazka dekorowanaKsiazka)
	{
		this.dekorowanaKsiazka = dekorowanaKsiazka;
	}
}
