package main;

public class KsiazkaZObwoluta extends KsiazkaDekorator{
	
	public KsiazkaZObwoluta(Ksiazka dekorowanaKsiazka)
	{		
		super(dekorowanaKsiazka);
	}
	
	@Override
	public String toString()
	{
		return super.toString() + "obwoluta" + "|";
	}

	@Override
	public String getAutor() {
		// TODO Auto-generated method stub
		return dekorowanaKsiazka.getAutor();
	}

	@Override
	public String getTytul() {
		// TODO Auto-generated method stub
		return dekorowanaKsiazka.getTytul();
	}

	@Override
	public Integer getIloscStron() {
		// TODO Auto-generated method stub
		return dekorowanaKsiazka.getIloscStron();
	}
}
