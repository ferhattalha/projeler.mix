package okul;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OgretmenIslemBilgileri {
	List<Ogretmen> ogretmen=new ArrayList<>();
	Scanner scan=new Scanner(System.in);
	Runner r=new Runner();
	
	
public void ekle() {
	
	System.out.println("Ad soyad giriniz: ");
	String adSoyad=scan.nextLine();
	System.out.println("Yasinizi giriniz: ");
	int yas=scan.nextInt();
	scan.nextLine();
	System.out.println("Kimlik no:");
	String kimlikNo=scan.nextLine();
	System.out.println("Bolum: ");
	String bolum=scan.nextLine();
	System.out.println("Sicil No: ");
	String sicilNo=scan.nextLine();
	ogretmen.add(new Ogretmen(adSoyad,yas,kimlikNo,bolum,sicilNo));
	System.out.println("Ekleme islemi basarili ");
	r.ogretmenIslemBilgileri();

}
public void listele() {
	for (Ogretmen o : ogretmen) {
		System.out.println(o.toString());
	}
	r.ogretmenIslemBilgileri();
}
public void ara() {
	System.out.println("Aramak istedininiz ogretmenin kimlik numarasini giriniz: ");
	String ara=scan.nextLine();
	boolean varMi=false;
	for (Ogretmen o : ogretmen) {
		if (o.kimlikNo.equals(ara)) {
			System.out.println("Aradiginiz ogretmen "+o.toString());
			varMi=true;
		}
	}
	if (!varMi) {
		System.out.println("yok");
	}
	r.ogretmenIslemBilgileri();
}
public void sil() {
	System.out.println("Silmek istediginbiz ogretmenin kimlik numarasini giriniz: ");
	String sil=scan.next();
	boolean var=false;
	for (int i = 0; i < ogretmen.size(); i++) {
		if (sil.equals(ogretmen.get(i).kimlikNo)) {
			ogretmen.remove(ogretmen.get(i));
			System.out.println("Silme islemi gerceklestirildi");
			var=true;
			
		}
	}
	if (!var) {
		System.out.println("Yok");
	}
	r.ogretmenIslemBilgileri();
}
}