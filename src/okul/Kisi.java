package okul;

public class Kisi {
protected String adSoyad;
protected String kimlikNo;
protected  int yas;

public Kisi(String adSoyad2, int yas2, String kimlikNo2) {
	this.adSoyad=adSoyad2;
	this.yas=yas2;
	this.kimlikNo=kimlikNo2;
}
public String getAdSoyad() {
	return adSoyad;
}
public void setAdSoyad(String adSoyad) {
	this.adSoyad = adSoyad;
}
public String getKimlikNo() {
	return kimlikNo;
}
public void setKimlikNo(String kimlikNo) {
	this.kimlikNo = kimlikNo;
}
public int getYas() {
	return yas;
}
public void setYas(int yas) {
	this.yas = yas;
}


}
