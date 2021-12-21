package marketprojesi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class urunler {
	
	public urunler() {
		
	}

	List <String> marketUrunler=new ArrayList<>(Arrays.asList("Yogurt","Kagıt Havlu","Mercimek","Makarna","Şise Süt"));
	List <String> sakuteriUrunler=new ArrayList<>(Arrays.asList("Sucuk","Salam","Jambon","Bomfile","Kavurma","Pastırma"));
	List<String> manavUrunler=new ArrayList<>(Arrays.asList("Domates","Patates","Biber","Soğan","Havuç","Elma","Muz","Çilek","Kavun","Üzüm","Limon"));
	
	List<Double> manavFiyatlar=new ArrayList<>(Arrays.asList(2.10,3.20,1.50,2.30,3.10,1.20,1.90,6.10,4.30,2.70,0.50));
	List<Double>sakuteriFiyatlar=new ArrayList<>(Arrays.asList(48.50,103.4,55.75,125.75,45.80,175.80));
	List<Double> marketFiyatlar=new ArrayList<>(Arrays.asList(69.49,158.0,64.5,30.0,16.00));
	
	List<String> sepettekiUrunler=new ArrayList<>();
	List<Double> sepettekiUrunmiktar=new ArrayList<>();
	List<Double> sepettekiUrunFiyat=new ArrayList<>();
	
	
	
	
	
	public urunler(List<String> sepettekiUrunler, List<Double> sepettekiUrunmiktar, List<Double> sepettekiUrunFiyat) {
		super();
		this.sepettekiUrunler = sepettekiUrunler;
		this.sepettekiUrunmiktar = sepettekiUrunmiktar;
		this.sepettekiUrunFiyat = sepettekiUrunFiyat;
	}
	
	

	
}
