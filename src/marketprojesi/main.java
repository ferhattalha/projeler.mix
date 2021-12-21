
package marketprojesi;

import java.text.DecimalFormat;
import java.util.Scanner;

public class main {
	static bolumler bolum = new bolumler();
	static Scanner scan = new Scanner(System.in);
	static double sepetToplamFiyat;
	static int secim;
	static int urunKodu = 0;
	static double miktar;

	public static void main(String[] args) {
		/*
		 * ====================PROJEMIZ=================================== ilk programa
		 * girildiginde bizi bir menu karsilasin bu secenekler 1 manav, 2 sarkuteri, 3
		 * market secime gor ,
		 * 
		 * 4-urunleri listele ve 5-fiyatlari gelsin
		 * 
		 * Basrili Market alış-veriş programı.
		 * 
		 * 1. Adım:* Ürünler ve fiyatları içeren listeleri oluşturunuz.
		 * 
		 * No Ürün Fiyat ===== ======= ======== 00 Domates 2.10 TL , 01 Patates 3.20 TL
		 * , 02 Biber 1.50 TL , 03 Soğan 2.30 TL , 04 Havuç 3.10 TL 05 Elma 1.20 TL 06
		 * Muz 1.90 TL 07 Çilek 6.10 TL 08 Kavun 4.30 TL 09 Üzüm 2.70 TL 10 Limon 0.50
		 * TL
		 * 
		 * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz. 3.
		 * Adım: Kaç kg satın almak istediğini sorunuz. 4. Adım: Alınacak bu ürünü
		 * sepete ekleyiniz ve Sepeti yazdırınız. 5. Başka bir ürün alıp almak
		 * istemediğini sorunuz. 6. Eğer devam etmek istiyorsa yeniden ürün seçme
		 * kısmına yönlendiriniz. 7. Eğer bitirmek istiyorsa ödeme kısmına geçiniz ve
		 * ödeme sonrasında programı bitiriniz
		 * 
		 */

		menu();

	}

	private static void menu() {

		System.out.println("\n====HOŞ GELDİNİZ=====\n");

		System.out.println("1.Manav Bölümü\n" + "2.Şarkuteri Bölümü\n" + "3.Market Bölümü\n" + "4.Sepetteki Ürünler\n"
				+ "5.Sepetteki Ürün Silme\n" + "6.Ödeme Bölümü\n" + "7.Çıkış");
		System.out.print("\nSeciminizi yapın.: ");
		secim = scan.nextInt();

		switch (secim) {
		case 1:
			manav();

			break;

		case 2:
			sakuteri();
			break;
		case 3:
			market();
			break;
		case 4:
			listeleme();
			break;
		case 5:
			silme();
			break;

		case 6:

			System.out.println("Ödemeniz gereken Toplam Borc: " + new DecimalFormat("##.###").format(sepetToplamFiyat));
			odeme(sepetToplamFiyat);
			break;

		default:
			System.out.println("Hatalı bir secim yaptınız.");
			System.out.println("Menuye tekrar Dönmek İçin Bir Tuşa Basın.");
			scan.next();
			menu();
			break;
		}

	}

	private static void silme() {
		System.out.println("Sepetteki ürünler:\nÜrün \t\tMiktar\t\tFiyat");
		for (int i = 0; i < bolum.sepettekiUrunler.size(); i++) {

			System.out
					.println((i + 1) + " " + bolum.sepettekiUrunler.get(i) + "\t\t " + bolum.sepettekiUrunmiktar.get(i)
							+ "\t\t " + new DecimalFormat("##.###").format(bolum.sepettekiUrunFiyat.get(i)));
		}
		System.out.print("Hangi ürünü silmek istiyorsanız numarasını girin.: ");
		int sec = scan.nextInt();

		bolum.sepettekiUrunler.remove(sec - 1);
		bolum.sepettekiUrunFiyat.remove(sec - 1);
		bolum.sepettekiUrunmiktar.remove(sec - 1);
		System.out.println("İstenilen Ürün Sepetten Silindi.\nYeni silme yapılacak mı?(E/H)");
		char cevap = scan.next().toLowerCase().charAt(0);
		if (cevap == 'e') {
			silme();

		} else
			menu();

	}

	private static void listeleme() {
		System.out.println("Sepetteki ürünler:\nÜrün \t\tMiktar\t\tFiyat");
		for (int i = 0; i < bolum.sepettekiUrunler.size(); i++) {

			System.out.println(bolum.sepettekiUrunler.get(i) + "\t\t " + bolum.sepettekiUrunmiktar.get(i) + "\t \t"
					+ new DecimalFormat("##.###").format(bolum.sepettekiUrunFiyat.get(i)));
		}
		System.out.println(
				"Sepetteki ürünlerin toplamı :" + new DecimalFormat("##.###").format(sepetToplamFiyat) + " TL'dir");
		System.out.println("\nMenuye dönmek için bir tuşa basın.");
		scan.next();
		menu();

	}

	private static void market() {
		try {
			System.out.println("Market Bölümü");
			System.out.println("===============");
			for (int i = 0; i < bolum.marketUrunler.size(); i++) {
				System.out.println((i + 1) + " " + bolum.marketUrunler.get(i) + " \t\t" + bolum.marketFiyatlar.get(i));
			}
			System.out.print("\nNe Almak İstiyorsunuz Seciminizi yapın :  ");
			urunKodu = scan.nextInt() - 1;
			System.out.print("Kaç kilo alıcaksınız : ");
			miktar = scan.nextDouble();
			sepeteEkle(urunKodu, miktar);
			sepetToplamFiyat = sepetHesapla();
			System.out.println("Ürünler Sepete eklendi. devam etmek için bir tuşa basın");
			System.out.println("\nYeni ürün alınacak mı?(E/H)");
			char cevap = scan.next().toLowerCase().charAt(0);
			if (cevap == 'e') {
				market();

			} else
				menu();

		} catch (IndexOutOfBoundsException e) {
			System.out.println("Listede olmayan bir ürün girdiniz" + "\nListede olan ürün sayısı :"
					+ bolum.manavUrunler.size() + " sizin girdiginiz ürün kodu: " + (urunKodu + 1));
			System.out.println("Menuye tekrar dönmek için bir tuşa basın.");
			scan.next();
			market();
		}

	}

	private static void sakuteri() {

		try {
			System.out.println("Şaküteri Bölümü");
			System.out.println("=====================");
			for (int i = 0; i < bolum.sakuteriUrunler.size(); i++) {
				System.out.println(
						(i + 1) + " " + bolum.sakuteriUrunler.get(i) + " \t\t" + bolum.sakuteriFiyatlar.get(i));
			}
			System.out.print("\nNe Almak İstiyorsunuz Seciminizi yapın:  ");
			urunKodu = scan.nextInt() - 1;
			System.out.print("Kaç kilo alıcaksınız: ");
			miktar = scan.nextDouble();
			sepeteEkle(urunKodu, miktar);
			sepetToplamFiyat = sepetHesapla();
			System.out.println("Ürünler Sepete eklendi.");
			System.out.print("Yeni ürün alımı yapılacak mı?(E/H)");
			char cevap = scan.next().toLowerCase().charAt(0);
			if (cevap == 'e') {
				sakuteri();

			} else
				menu();
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Listede olmayan bir ürün girdiniz" + "\nListede olan ürün sayısı :"
					+ bolum.manavUrunler.size() + " sizin girdiginiz ürün kodu: " + (urunKodu + 1));
			System.out.println("Menuye tekrar dönmek için bir tuşa basın.");
			scan.next();
			sakuteri();
		}

	}

	private static void manav() {
		try {
			System.out.println("Manav Bölümü");
			System.out.println("====================");
			for (int i = 0; i < bolum.manavUrunler.size(); i++) {
				System.out.println((i + 1) + " " + bolum.manavUrunler.get(i) + " \t" + bolum.manavFiyatlar.get(i));
			}
			System.out.println("\nNe Almak İstiyorsunuz Seciminizi yapın ");
			urunKodu = scan.nextInt() - 1;
			System.out.println("Kaç kilo alıcaksınız?");
			miktar = scan.nextDouble();
			sepeteEkle(urunKodu, miktar);
			sepetToplamFiyat = sepetHesapla();
			System.out.println("Yeni ürün alımı yapılacak mı?(E/H)");
			char cevap = scan.next().toLowerCase().charAt(0);
			if (cevap == 'e') {
				manav();

			} else
				menu();
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Listede olmayan bir ürün girdiniz" + "\nListede olan ürün sayısı :"
					+ bolum.manavUrunler.size() + " sizin girdiginiz ürün kodu: " + (urunKodu + 1));
			System.out.println("Menuye tekrar dönmek için bir tuşa basın.");
			scan.next();
			manav();
		}

	}

	private static void odeme(double sepetToplamFiyat) {

		double nakit = 0;

		do {

			System.out.print("Lütfen ödemenizi yapın: ");
			nakit += scan.nextDouble();
			if (nakit < sepetToplamFiyat) {
				System.out.println(
						"eksik ödeme yaptınız " + new DecimalFormat("##.###").format((sepetToplamFiyat - nakit))
								+ " daha ödemeniz gereklidir.");
			}
		} while (nakit < sepetToplamFiyat);

		double paraustu = nakit - sepetToplamFiyat;
		if (paraustu > 0) {
			System.out.println("Para Üstünüz :" + new DecimalFormat("##.###").format(paraustu) + "\nGene bekleriz");
		} else {
			System.out.println("yine Bekleriz.");
		}

	}

	private static double sepetHesapla() {

		double sepetToplam = 0;

		for (int i = 0; i < bolum.sepettekiUrunFiyat.size(); i++) {
			sepetToplam += bolum.sepettekiUrunFiyat.get(i);

		}
		return sepetToplam;
	}

	private static void sepeteEkle(int urunNo, double miktar) {
		if (secim == 1) {
			bolum.sepettekiUrunler.add(bolum.manavUrunler.get(urunNo));
			bolum.sepettekiUrunmiktar.add(miktar);
			

		} else if (secim == 2) {
			bolum.sepettekiUrunler.add(bolum.sakuteriUrunler.get(urunNo));
			bolum.sepettekiUrunmiktar.add(miktar);
			bolum.sepettekiUrunFiyat.add(bolum.sakuteriFiyatlar.get(urunNo) * miktar);

		} else {
			bolum.sepettekiUrunler.add(bolum.marketUrunler.get(urunNo));
			bolum.sepettekiUrunmiktar.add(miktar);
			bolum.sepettekiUrunFiyat.add(bolum.marketFiyatlar.get(urunNo) * miktar);
		}

	}

}
