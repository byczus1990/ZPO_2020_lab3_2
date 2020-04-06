package main;

public class KsiazkaZOkladkaZwykla implements Publikacja{
	
	protected Publikacja publikacja;

	public KsiazkaZOkladkaZwykla(Publikacja publication)
	{		
		this.publikacja = publication;
	}
	
	@Override
	public String toString()
	{
		return "|" + getAutor() + "|" + getTytul() +"|" + getIloscStron() + "|" + "okladka zwykla" + "|";
	}

	@Override
	public String getAutor() {
		// TODO Auto-generated method stub
		return publikacja.getAutor();
	}

	@Override
	public String getTytul() {
		// TODO Auto-generated method stub
		return publikacja.getTytul();
	}

	@Override
	public Integer getIloscStron() {
		// TODO Auto-generated method stub
		return publikacja.getIloscStron();
	}
}
