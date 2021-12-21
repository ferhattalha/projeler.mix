package kutuoyunu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OyunGirisi {

	/*
	 * 1. Adim --> 10 farkli kutu olsun ve bu kutular farkli miktarda para icersin
	 * paralistesi isminde bir listede bunlari tutalim
	 * 
	 * 2 Adim --> 10 tane kutu oluşturacağım.Bu kutularin içerisine listede
	 * oluşturduğum para miktarini rasgele bir şekilde atayacağim. Kutu isminde bir
	 * class olusturacagim. Oluşturduğumuz bu classta kutuNumarasi ve paraMiktari
	 * adinda iki int tipinde değişken yaz.
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

	static List<Integer> paraListesi = new ArrayList();
	static Kutular kutular = new Kutular();
	static int kutuNumaram;
	static int paraMiktarim;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		

		paraListesi.addAll(Arrays.asList(1, 10, 500, 1000, 5000, 10000, 50000, 100000, 250000, 500000));
		Collections.shuffle(paraListesi); // belirtilen listedeki elemanlarin yerini rastgele değiştirir.

		for (int i = 0; i < 10; i++) { // 0,1,2,3,4,5,6,7,8,9 index
			int kutuNo = i + 1; // 1,2,3,4,5,6,7,8,9,10 no

			Kutu kutu = new Kutu(kutuNo, paraListesi.get(i)); // icinde kutu olan ve para olan kutuyu para listesine
																// atamam gerekiyor
			kutular.kutuEkle(kutu);

		}
		System.out.println(" Oyunumuza HosGeldin\nLütfen bir kutu secini-"
				+ ""
				+ ""
				+ "z");
		kutuNumaram = scan.nextInt();
		paraMiktarim = paraListesi.get(kutuNumaram - 1);

		kutular.secilenKutuyuKutularListesindenSil(kutuNumaram);
		kutuSecmeActirma();

	}

	   static public void kutuSecmeActirma() {
		   
		System.out.println("kalan kutular :" + kutular.acilmamisKutulariGöster());
		System.out.println("hangi kutuyu acmak istersiniz");
		int secim = scan.nextInt();
		kutular.kutuActir(secim);
		if (kutular.kalanKutuSayisi() == 7 || kutular.kalanKutuSayisi() == 4 || kutular.kalanKutuSayisi() == 1) {

			System.out.println(" Teklifiniz :" + kutular.YapimcininTeklifiniAl(paraMiktarim));
			System.out.println("teklifi kabul ediyor musun (1- Evet 2 -Hayir");

			int yanit = scan.nextInt();
			if (yanit == 1) {

				System.out.println("oyun bitti");
				System.out.println("kazanilan miktar : " + kutular.YapimcininTeklifiniAl(paraMiktarim));
				System.out.println("kendi kutumuzdaki miktar : " + paraMiktarim);

			} else {
				kutuSecmeActirma();
			}

		} else {
			if (kutular.kalanKutuSayisi() > 0) {
				kutuSecmeActirma();
			} else {
				System.out.println("oyun bitti");
				System.out.println("kutunuzdaki miktar :" + paraMiktarim);
			}

		}

	}

}
