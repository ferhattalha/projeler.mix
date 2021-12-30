package laptopproject;

import java.util.Scanner;

public class Pesin {
	
	private static int indirimliFiyat;
	static Indirim ind=new Indirim();
	
	public static void pesinOdeme(int toplam){		
		Scanner scan=new Scanner (System.in);		
		System.out.println("Toplam tutar ==> "+toplam);
		ind.indirimOrani(toplam);
		indirimliFiyat= toplam-(toplam*ind.indirim/100);
		System.out.println("Odenecek Tutar = "+indirimliFiyat);
		
		for (int i = 1; i >0; i++) {
			
			Scanner scan1=new Scanner(System.in);
			System.out.println("Lutfen yapacaginiz odeme tutarini giriniz");
			int tutar=scan.nextInt();
			if (tutar == indirimliFiyat) {
				System.out.println("Odemeniz yapildi");	
				break;
			} else if(tutar > indirimliFiyat){
				System.out.println("Para ustu = "+(tutar-indirimliFiyat));
				System.out.println("Odemeniz yapildi");
				break;
			}else if(tutar < indirimliFiyat) {
				System.out.println("Odemeniz yetersiz");
				indirimliFiyat=indirimliFiyat-tutar;
				System.out.println("Odemeniz gereken tutar ==> "+indirimliFiyat);
			}
			
		}
		
		
	}
}
