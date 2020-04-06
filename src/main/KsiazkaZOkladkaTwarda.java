package main;

public class KsiazkaZOkladkaTwarda implements Publikacja{

	protected Publikacja publikacja;
	
	public KsiazkaZOkladkaTwarda(Publikacja publication)
	{
		this.publikacja = publication;
		if(publikacja.toString().contains("okladka zwykla") || publikacja.toString().contains("okladka twarda"))
		{
			throw new IllegalArgumentException("Ta ksi��ka ma ju� ok�adk�");
		}
	}
	
	@Override
	public String toString()
	{
		return "|" + getAutor() + "|" + getTytul() +"|" + getIloscStron() + "|" + "okladka twarda" + "|";
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
