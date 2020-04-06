package main;

public class SbStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Publikacja k1 = new Ksiazka("Adam Mickiewicz", "Pan Tadeusz", 340);
		Publikacja k2 = new Ksiazka("Adam Mickiewicz", "Dziady", 130);
		Publikacja kk1 = new KsiazkaZOkladkaZwykla(k1);
		Publikacja kk2 = new KsiazkaZOkladkaTwarda(k2);
//		Publikacja kk3 = new KsiazkaZOkladkaZwykla(kk1);
		Publikacja kkk2 = new KsiazkaZObwoluta(kk1);
//		Publikacja kkk3 = new KsiazkaZObwoluta(kkk2);
//		Publikacja kkk4 = new KsiazkaZObwoluta(k1);
		Publikacja dziadyZAutografemWieszcza = new KsiazkaZAutografem(kk2, "Drogiej Hani - Adam Mickiewicz");
//		Publikacja dziadyZDwomaAutografami = new KsiazkaZAutografem(dziadyZAutografemWieszcza, "Haniu, to nieprawda, Dziady napisa³em ja, Julek S³owacki!");

		System.out.print(k1 + "\n");
		System.out.print(kk1 + "\n");
		System.out.print(k2 + "\n");
		System.out.print(kk2 + "\n");
		System.out.print(kkk2 + "\n");
		System.out.print(dziadyZAutografemWieszcza);



	}

}
