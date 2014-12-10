

/** korisnik unosi broj clanova niza,
* funkcija traba da kreira niz,korisnik unosi unutar funkcije clanove
* druga funkcija ispisuje sve clanove niza
*/

public class VjezbaNizovi {

	public static void main(String[] args) {

		System.out.println("Broj Clanova niza: ");
		int brojClanovaNiza = TextIO.getlnInt();//odredjivanje broja clanova niza
		if (brojClanovaNiza==0);{
			throw new IllegalArgumentException ("Ne moze biti duzina niza 0");
		}
		
		int [] nizZaUnos = popunjavanjeNiza(brojClanovaNiza);		//unos clanova niza

		ispisNiza(nizZaUnos);//ispisivanje pojedinacnih clanova niza
		
		System.out.print("Duzina niza je \n "+nizZaUnos.length);
		System.out.print("\nMnozenje niza je\n "+mnozenjeNiza(nizZaUnos));
		
	}	

	private static void ispisNiza(int[] nizZaUnos) {//ispis clanova niza
		
		for (int i = 0; i < nizZaUnos.length; i++) {
			if (i == nizZaUnos.length -1){
			System.out.println(nizZaUnos[i]);//izbacije zadnji clan bez zareza na kraju
			} else {
				System.out.println("Niz: ");
				System.out.print(nizZaUnos[i] + ", ");	//stavlja zarez iza svakog clana
				
			}
			
		}
		
	}

	private static int[] popunjavanjeNiza(int duzinaNiza) { //unos clanova niza
		
		int[] nizZaUnos = new int[duzinaNiza];
		
		for (int i = 0; i < duzinaNiza; i++) {
			System.out.printf("Unesi %d. clan niza: \n", i + 1);
			nizZaUnos[i] = TextIO.getlnInt();
		}
		return nizZaUnos;
	}
	private static int mnozenjeNiza(int []nizZaUnos) {
		int mnozenje=1;
		for (int i=0;i<nizZaUnos.length;i++){
			mnozenje=nizZaUnos[i]*mnozenje;
		}
	return mnozenje;
	}
	catch (IllegalArgumentException e){
		System.out.println("Broj Clanova niza");
	}
}

			


