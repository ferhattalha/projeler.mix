package kutuoyunu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class TamaMi_DevamMiOyunGirisi {
	/*
	 * 1. Adim --> 10 farkli kutu olsun ve bu kutular farkli miktarda para icersin
	 * "paraListesi" isminde bir listede bunlari tutalim
	 * 
	 * 2 Adim --> Kutu isminde bir class olusturacagim Oluşturduğumuz bu classta
	 * kutuNumarasi ve paraMiktari adinda iki int tipinde değişken yazacağim.
	 * 
	 * 10 tane kutu oluşturacağım.Bu kutularin içerisine listede oluşturduğum para
	 * miktarini rasgele bir şekilde atayacağim.
	 * 
	 * 3. Adim --> yeni bir class olusturalim.Kutular ismini verelim. Kullanacağımız
	 * methodlari burada oluşturalim.
	 * 
	 * 4. --> Oyunu baslatalim, kullanicidan secmek istedigi kutu numarasini alalim,
	 * secilen kutuyu var olan kutularin icerisinden kaldıralim. /* public void
	 * kutuEkle(Kutu kutu) public void kutuActir(int kutuNumarasi) public int
	 * kalanKutuSayisi() public int kutulardakiToplamParaMikrari() public void
	 * secilenKutuyuKutularListesindenKaldir(int kutuNumarasi) public int
	 * YapimcininTeklifiniAl() public String acilmamisKutulariGöster() public void
	 * kaybedilenTutarlar()
	 */
	static List<Integer> paraListesi = new ArrayList<>();
	static Kutular1 kutular1 = new Kutular1();
	static int kutuNumaram;
	static int paraMiktarim;
	static Scanner scan = new Scanner(System.in);

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		paraListesi.addAll(Arrays.asList(1, 10, 100, 250, 500, 1000, 2500, 5000, 7500, 10000));

		Collections.shuffle(paraListesi);

		for (int i = 0; i < 10; i++) {
			int kutuNo = i + 1;
			Kutu1 kutu = new Kutu1(kutuNo, paraListesi.get(i)); // icinde kutu olan ve para olan kutuyu para listesine
			// atamam gerekiyor
			kutular1.kutuEkle(kutu);

		}
		System.out.println("Oyunumuza Hosgeldiniz\nLütfen bir kutu seçiniz");
		kutuNumaram = scan.nextInt();

		paraMiktarim = paraListesi.get(kutuNumaram - 1);

		kutular1.secileniKutularListesindenKaldir(kutuNumaram);

		kutuSecmeActirma();

	}

	@SuppressWarnings("static-access")
	public static void kutuSecmeActirma() {
		System.out.println("kalan kutular :" + kutular1.acilmamisKutulariGöster());

		System.out.println(" hangi kutuyu actırmak istersiniz ");

		int secim = scan.nextInt();
		kutular1.kutuActir(secim);
		if (kutular1.kalanKutuSayisi() == 7 || kutular1.kalanKutuSayisi() == 4 || kutular1.kalanKutuSayisi() == 2) {

			System.out.println("TEKLİFİNİZ :" + kutular1.YapimcininTeklifiniAl());

			System.out.println("Teklifi Kabul EDİYORMUSUN:  1 -EVET 2- HAYIR ");

			int yanit = scan.nextInt();
			if (yanit == 1) {
				System.out.println("oyun bitti");
				System.out.println("kazanilan Miktar :" + kutular1.YapimcininTeklifiniAl());
			} else {
				kutular1.secileniKutularListesindenKaldir(secim);
				kutuSecmeActirma();
			}
		} else {
			if ( kutular1.kalanKutuSayisi()==1  ) {
				System.out.println("oyun bitti");
				System.out.println("sectiginiz kutuda kazandiginiz Para Miktari : "+ paraMiktarim);
			}else {
			kutular1.secileniKutularListesindenKaldir(secim);
			kutuSecmeActirma();
			}
		}
      
	}

}
