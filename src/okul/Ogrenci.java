package okul;

public class Ogrenci extends Kisi{
private String numara;
private String sinif;
public Ogrenci(String adSoyad, int yas, String kimlikNo, String okulNo, String sinif2) {
	super(adSoyad,yas,kimlikNo);
	this.numara=okulNo;
	this.sinif=sinif2;	
}





public String getNumara() {
	return numara;
}
public void setNumara(String numara) {
	this.numara = numara;
}
public String getSinif() {
	return sinif;
}
public void setSinif(String sinif) {
	this.sinif = sinif;
}





@Override
public String toString() {
	return "Ogrenci [adSoyad=" + adSoyad + ", kimlikNo=" + kimlikNo
			+ ", yas=" + yas + " numara=" + numara +", sinif=" + sinif + ", ]";
}



}
