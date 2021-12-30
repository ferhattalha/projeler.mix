package laptopproject;

import java.util.Scanner;

public class KrediKarti {
	static int indirimliFiyat;
	private static Data hesap=new Data();
	private static String sfr;
	
	public static void kartOdeme(int toplam){
		Scanner scan=new Scanner (System.in);
		Indirim ind=new Indirim();
		System.out.println("Toplam tutar ==> "+toplam);
		ind.indirimOrani(toplam);
		indirimliFiyat=toplam-(toplam*ind.indirim/100);
		
		for (int i = 1; i > 0; i++) {
			Scanner scan1=new Scanner(System.in);
			System.out.println("Lutfen 16 haneli kart numaranizi giriniz");
			String nu=scan1.nextLine();
			for (int j = 0; j < hesap.kartNo.length ; j++) {
				if (nu.equals(hesap.kartNo[j])) {
					sfr=hesap.sifre[j];					
				}}
			System.out.println("Sifrenizi giriniz");
			String sfr1=scan1.next();
			if (sfr.equals(sfr1)) {
				System.out.println("Odemeniz tamamlandi");
				break;
			}else {
				System.out.println("Hatali giris yaptiniz");
			}
				
			
			
			
		}
		
		
		
	}
}
