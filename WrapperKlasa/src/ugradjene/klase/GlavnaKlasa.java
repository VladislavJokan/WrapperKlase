package ugradjene.klase;

public class GlavnaKlasa {

	public static void main(String[] args) {
		
		/*char karakter = 'u';
		
		Enkapsulacija.daLiJeSlovo(karakter);
		
		String x = "2";
		String y = "5";
		
		int prviBroj = Integer.parseInt(x);
		int drugiBroj = Integer.parseInt(y);
		
		System.out.println(prviBroj + drugiBroj);*/
		
		/*// konkatenacija Stringa
		
		String a = "pera";
		String b = "detlic";
		
		System.out.println(a + b);
		
		StringBuilder builder = new StringBuilder();
		builder.append(a);
		builder.append(b);
		
		System.out.println(builder);
		
		// duzina Stringa
		
		String rec = "otorinolaringologija";
		Enkapsulacija.brojacSlova(rec);
		*/
		
		// prolazak kroz String i uzimanje karaktera
		
		String password = "123Mjsdasad";
		
		Enkapsulacija.passwordValidation(password);
		
	}

}
