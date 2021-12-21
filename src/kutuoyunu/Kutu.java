package kutuoyunu;

import java.util.Objects;

public class Kutu {

	public Kutu() {
		
	}
	
	private int kutuNumarasi;
	private int paraMiktari;
	
/*	public Kutu(int kutuNumarasi, int paraMiktari) {
		super();
		this.kutuNumarasi = kutuNumarasi;
		this.paraMiktari = paraMiktari;
	}
	*/
	public Kutu(int sayi1, int sayi2) {
		super();
		this.kutuNumarasi = sayi1;                 // sayi1 kutunumarasi       sayi2 para mikrari
		this.paraMiktari = sayi2;
	}

	

	public int getKutuNumarasi() {
		return kutuNumarasi;
	}

	public int getParaMiktari() {
		return paraMiktari;
	}
	
	
	

}
