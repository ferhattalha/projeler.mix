package okul;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OgrenciIslemi {
	List<Ogrenci> ogrenci=new ArrayList<>();
	Scanner scan=new Scanner(System.in);
	Runner r=new Runner();
	
	
public void ekle() {
	
	System.out.println("Ad soyad giriniz: ");
	String adSoyad=scan.nextLine();
	System.out.println("Yasnizi giriniz: ");
	int yas=scan.nextInt();
	scan.nextLine();
	System.out.println("Kimlik no:");
	String kimlikNo=scan.nextLine();
	System.out.println("Okul no: ");
	String okulNo=scan.nextLine();
	System.out.println("Sinif: ");
	String sinif=scan.nextLine();
	ogrenci.add(new Ogrenci(adSoyad,yas,kimlikNo,okulNo,sinif));
	System.out.println("Ekleme islemi basarili ");
	r.ogrenciIslemBilgileri();

}
public void listele() {
	for (Ogrenci o : ogrenci) {
		System.out.println(o.toString());
	}
	r.ogrenciIslemBilgileri();
}
public void ara() {
	System.out.println("Aramak istediginiz ogrencinin kimlik numarasini giriniz: ");
	String ara=scan.nextLine();
	boolean varMi=false;
	for (Ogrenci o : ogrenci) {
		if (o.kimlikNo.equals(ara)) {
			System.out.println("Aradiginiz ögrenci "+o.toString());
			varMi=true;
		}
	}
	if (!varMi) {
		System.out.println("yok");
	}
	r.ogrenciIslemBilgileri();
}
public void sil() {
	System.out.println("Silmek istediginbiz ögrencinin kimlik numarasini giriniz: ");
	String sil=scan.next();
	boolean var=false;
	for (int i = 0; i < ogrenci.size(); i++) {
		if (sil.equals(ogrenci.get(i).kimlikNo)) {
			ogrenci.remove(ogrenci.get(i));
			System.out.println("Silme i�lemi ger�ekle�tirildi");
			var=true;
			
		}
	}
	if (!var) {
		System.out.println("Yok");
	}
	r.ogrenciIslemBilgileri();
}

}
