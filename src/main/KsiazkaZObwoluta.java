package main;

public class KsiazkaZObwoluta implements Publikacja{
	
	protected Publikacja publikacja;
	
	public KsiazkaZObwoluta(Publikacja publication)
	{		
		this.publikacja = publication;
		if(publikacja.toString().contains("okladka zwykla") || publikacja.toString().contains("okladka twarda"))
		{			
			if (publikacja.toString().contains("obwoluta"))	
			{
				throw new IllegalArgumentException("Ta ksi¹¿ka ma ju¿ obwolutê");
			}
		}else
			{
				throw new IllegalArgumentException("Ta ksi¹¿ka nie ma ok³adki");
			}		
	}
	
	@Override
	public String toString()
	{
		return publikacja.toString() + "obwoluta" + "|";
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
