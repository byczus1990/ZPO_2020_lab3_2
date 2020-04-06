package main;

public class KsiazkaZAutografem implements Publikacja{

	protected Publikacja publikacja;
	private String autograf;
	
	public KsiazkaZAutografem(Publikacja publication, String autograf)
	{		
		this.publikacja = publication;
		this.autograf = autograf;
		boolean isAlreadyAutographed = publikacja instanceof KsiazkaZAutografem;
		if (isAlreadyAutographed)
		{
			throw new IllegalArgumentException("Ta ksi¹¿ka ma ju¿ autograf");
		}
	}

	@Override
	public String toString()
	{
		return publikacja.toString() +  "'" + autograf + "'"+"|";
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
