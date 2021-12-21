package Hastaneprojesi;

public class Hasta {
private String ad;
private String soyad;
private int hastaId;
private Durum hastaDurumu;
public Hasta() {
	
	
}
@Override
public String toString() {
	return "Hasta [ad=" + ad + ", soyad=" + soyad + ", hastaId=" + hastaId + ", hastaDurumu=" + hastaDurumu + "]";
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
public int getHastaId() {
	return hastaId;
}
public void setHastaId(int hastaId) {
	this.hastaId = hastaId;
}
public Durum getHastaDurumu() {
	return hastaDurumu;
}
public void setHastaDurumu(Durum hastaDurumu) {
	this.hastaDurumu = hastaDurumu;
}

}
