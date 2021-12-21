package Hastaneprojesi;

public class Doktor {
	
	
@Override
	public String toString() {
		return "Doktor [ad=" + ad + ", soyad=" + soyad + ", unvan=" + unvan + "]";
	}
private String ad;
private String soyad;
private String unvan;
public Doktor() {
	
}
public String getAd() {
	return ad;
}
public void setAd(String ad) {
	this.ad = ad;
}
public String getSoyad() {
	return soyad;
}
public void setSoyad(String soyad) {
	this.soyad = soyad;
}
public String getUnvan() {
	return unvan;
}
public void setUnvan(String unvan) {
	this.unvan = unvan;
}



}
