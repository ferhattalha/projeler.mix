package kutuoyunu;

import java.util.ArrayList;
import java.util.List;

public class Kutular {
         
	 /*
 --	 public void kutuEkle(Kutu kutu)
 --	 public void kutuActir(int kutuNumarasi)
 -- public int kalanKutuSayisi()
 -- public int kutulardakiToplamParaMikrari()
 --	public void secilenKutuyuKutularListesindenKaldir(int kutuNumarasi)
 -- public int YapimcininTeklifiniAl()
 -- public String acilmamisKutulariGöster()
  -- public void kaybedilenTutarlar()
	 	  */
		
		List<Kutu>kutuListesi= new ArrayList<>(); // data type classtan aliyor.
		
		// datatype Kutu dedik cünkü Kutu classindan oluşturdugumuz nesneye 2 bilgi atadik.
		
		public void kutuEkle(Kutu kutu) {
			kutuListesi.add(kutu);
		}
		
		 public void kutuActir(int kutuNumarasi) {
			
			for (Kutu k : kutuListesi) {
				if (kutuNumarasi==k.getKutuNumarasi()) {
					
					System.out.println("kutudaki miktar= "+k.getParaMiktari());
					kutuListesi.remove(k);
					break;
				}
						
			} 
		 }
		
		 public int kalanKutuSayisi() {
			 return kutuListesi.size();
		 }
		 
		 public int kutulardakiToplamParaMikrari(){
			 int toplamPara=0;
			 
			for (Kutu k : kutuListesi) {
				
			toplamPara+=k.getParaMiktari();
			
			} 
			return toplamPara;
			
		 }
		 public void  secilenKutuyuKutularListesindenSil( int kutuNumarasi){
			 
			 for (Kutu k : kutuListesi) {
				 if (kutuNumarasi==k.getKutuNumarasi()) {
					kutuListesi.remove(k);
					break;
					
				}
				
			}
		 }
		 public int YapimcininTeklifiniAl( int oyuncununKendiKutusundakiMiktar) {
			
			 int teklif = (kutulardakiToplamParaMikrari()+oyuncununKendiKutusundakiMiktar)/2;
			 return teklif;
		 }
		
	
         public String acilmamisKutulariGöster() {
        	 
        	String acilmamisKutular= "";
        	 for (Kutu k : kutuListesi) {
			acilmamisKutular=acilmamisKutular+ " "+k.getKutuNumarasi();	
			}
           return acilmamisKutular;

      }
         
     
}        
         
         