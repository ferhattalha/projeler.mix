package okul;

public class Ogretmen extends Kisi{
private String bolum;
private String sicilNo;

public Ogretmen(String adSoyad, int yas, String kimlikNo, String bolum2, String sicilNo2) {
	super(adSoyad,yas,kimlikNo);
	this.bolum=bolum2;
	this.sicilNo=sicilNo2;
	
}
@Override
public String toString() {
	return "Ogretmen [ adSoyad=" + adSoyad + ", kimlikNo=" + kimlikNo
			+ ", yas=" + yas +" bolum=" + bolum + ", sicilNo=" + sicilNo + "]";
}
public String getBolum() {
	return bolum;
}
public void setBolum(String bolum) {
	this.bolum = bolum;
}
public String getSicilNo() {
	return sicilNo;
}
public void setSicilNo(String sicilNo) {
	this.sicilNo = sicilNo;
}



}
