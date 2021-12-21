package kutuoyunu;

import java.util.ArrayList;
import java.util.List;

/*
 public void kutuEkle(Kutu kutu)
 public void kutuActir(int kutuNumarasi)
 public int kalanKutuSayisi()
 public int kutulardakiToplamParaMiktari()
 public void secileniKutularListesindenKaldir(int kutuNumarasi)
 public int YapimcininTeklifiniAl()
 public String acilmamisKutulariGöster()

	 	  */


public class Kutular1 {
	
	static List<Kutu1>kutuListesi= new ArrayList<>();

	public static void kutuEkle(Kutu1 kutu) {
	
	kutuListesi.add(kutu);	
	}
	public static void kutuActir(int kutuNumarasi) {
		for (Kutu1 k : kutuListesi) {
			if (kutuNumarasi==k.getParaMiktari()) {
				kutuListesi.remove(k);
			}
		}
	}
	public static int kalanKutuSayisi() {
	return kutuListesi.size();
		
	}
	 public static int kutulardakiToplamParaMiktari() {
		 int toplamPara=0;
		 
		 for (Kutu1 k : kutuListesi) {
			toplamPara+=k.getParaMiktari();
			
		}return toplamPara;
	 }
	 public static void secileniKutularListesindenKaldir(int kutuNumarasi) {
		 
		 for (Kutu1 k : kutuListesi) {
			if (kutuNumarasi==k.getKutuNumarasi()) {
			kutuListesi.remove(k);	
			break;
			}
		}
	 }
	
	 public static int YapimcininTeklifiniAl() {
		int teklif= kutulardakiToplamParaMiktari()/4;
		return teklif;
	 }
	 
	 public static String acilmamisKutulariGöster() {
		 
		 String acilmamisKutular=" ";
		 for (Kutu1 k : kutuListesi) {
			acilmamisKutular=acilmamisKutular+" "+k.getKutuNumarasi();
			
		}
		 return acilmamisKutular;
	 }
	
}
