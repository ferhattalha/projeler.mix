package laptopproject;

import java.util.Scanner;



public class Main {
	private static int secim;
	private static Calculation hesap=new Calculation();
	private static KrediKarti kart=new KrediKarti();
	private static Pesin cash=new Pesin();

	public static void main(String[] args) {
		islem();

	}

	private static void islem() {
		Scanner scan=new Scanner (System.in);
		System.out.println("\t        ============================    ");
		System.out.println("\t         QuAlity COMPUTER HOSGELDINIZ ");
		System.out.println("\t        ==============================   ");
		System.out.println("**** Ana Menu *****");
		
		System.out.println("\t1-Laptop incelemek istiyorum \n\t2-Cikis");
		System.out.println("Seciminizi giriniz");
		secim=scan.nextInt();
		
		switch (secim) {
		case 1:
			urunSecme();
			satinAlma();			
			break;
		case 2:
			cikis();
			break;

		default:
			System.out.println("Hatali deger girdiniz");
			islem();
			break;
		}
		
		
		
	}

	private static void satinAlma() {
		Scanner scan=new Scanner (System.in);
		System.out.println("Secmis oldugunuz Laptop icin islemer");
		System.out.println("\t1- Satin alma islemi \n\t2-Laptop incelemeye devam etmek istiyorum \n\t3-Cikis");
		System.out.println("Isleminizi giriniz");
		secim=scan.nextInt();
		
		switch (secim) {
		case 1:
			odeme();
			islem();
			break;
		case 2:
			urunSecme();
			satinAlma();
			break;
		case 3:
			cikis();
			break;

		default:
			System.out.println("Hatali giris yaptiniz");
			satinAlma();
			break;
		}		
		
	}

	private static void odeme() {
		Scanner scan=new Scanner (System.in);
		System.out.println("Odeme islemini seciniz \n\t1-Kredi Karti \n\t2-Pesin ");
		System.out.println("Isleminizi seciniz");
		secim=scan.nextInt();
		switch (secim) {
		case 1:
			kart.kartOdeme(hesap.getToplamFiyat());
			break;
		case 2:
			cash.pesinOdeme(hesap.getToplamFiyat());		
			break;

		default:
			System.out.println("Hatali giris yaptiniz");
			odeme();
			break;
		}
		
	}

	private static void cikis() {
		System.out.println("IYI GUNLER \n\tBIZI SECTIGINIZ ICIN \n\t\t\tTESEKKUR EDERİZ");
		
	}

	private static void urunSecme() {
		Scanner scan=new Scanner (System.in);
		System.out.println("**** Laptop Cesitlerimiz *****");
		for (int i = 0; i < hesap.laptopNames.length; i++) {
			System.out.println(i+1+" - "+hesap.laptopNames[i]+"   \t\tFiyati  "+hesap.laptopPrice[i]);			
		}
		System.out.println("Seciminizi yapiniz");
		secim=scan.nextInt()-1;
		hesap.setToplamFiyat(hesap.laptopPrice[secim]);
		System.out.println("Toplam tutar = "+hesap.getToplamFiyat());
		
		
		System.out.println("****Isletim Sistemi Cesitlerimiz *****");
		for (int i = 0; i < hesap.cpu.length; i++) {
			System.out.println(i+1+" - "+hesap.cpu[i]+"   \t\tFiyati  "+hesap.cpuPrice[i]);			
		}
		System.out.println("Seciminizi yapiniz");
		secim=scan.nextInt()-1;
		hesap.setToplamFiyat(hesap.getToplamFiyat()+hesap.cpuPrice[secim]);
		System.out.println("Toplam tutar = "+hesap.getToplamFiyat());
		
		System.out.println("****Ram Cesitlerimiz *****");
		for (int i = 0; i < hesap.ram.length; i++) {
			System.out.println(i+1+" - "+hesap.ram[i]+"   \t\tFiyati  "+hesap.ramPrice[i]);			
		}
		System.out.println("Seciminizi yapiniz");
		secim=scan.nextInt()-1;
		hesap.setToplamFiyat(hesap.getToplamFiyat()+hesap.ramPrice[secim]);
		System.out.println("Toplam tutar = "+hesap.getToplamFiyat());
		
		System.out.println("****Renk Cesitlerimiz *****");
		for (int i = 0; i < hesap.color.length; i++) {
			System.out.println(i+1+" - "+hesap.color[i]+"   \t\tFiyati  "+hesap.colorPrice[i]);			
		}
		System.out.println("Seciminizi yapiniz");
		secim=scan.nextInt()-1;
		hesap.setToplamFiyat(hesap.getToplamFiyat()+hesap.colorPrice[secim]);
		System.out.println("Toplam tutar = "+hesap.getToplamFiyat());
		
		System.out.println("****Laptop Ebat Cesitlerimiz *****");
		for (int i = 0; i < hesap.size.length; i++) {
			System.out.println(i+1+" - "+hesap.size[i]+"   \t\tFiyati  "+hesap.sizePrice[i]);			
		}
		System.out.println("Seciminizi yapiniz");
		secim=scan.nextInt()-1;
		hesap.setToplamFiyat(hesap.getToplamFiyat()+hesap.sizePrice[secim]);
		System.out.println("Toplam tutar = "+hesap.getToplamFiyat());
		
		
		
		
		
	}

}
