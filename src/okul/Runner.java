package okul;

import java.util.Scanner;

public class Runner {
	static Scanner scan = new Scanner(System.in);
	static OgrenciIslemi o = new OgrenciIslemi();
	static OgretmenIslemBilgileri oo=new OgretmenIslemBilgileri();

	public static void main(String[] args) {
		Runner menu = new Runner();
		menu.menu();

	}

	public void menu() {
		System.out.println(
				"====================================\nOGRENC� VE OGRETMEN YÖNETİM PANELA\n===================================="
						+ "\n1- OGRENCİ İŞLEMLERİ\n2- ÖGRETMEN İSLEMLERİ\nQ- CIKIS");
		System.out.println("Seciminiz: ");
		String secim = scan.next();
		switch (secim) {
		case "1":
			ogrenciIslemBilgileri();
			break;
		case "2":
			ogretmenIslemBilgileri();
			break;
		case "Q":
			cikis();
			break;

		default:
			System.out.println("Hatali giris");
			break;
		}

	}

	public void ogrenciIslemBilgileri() {
		System.out.println(
				"========== OGRENCİ İSLEMLER ==========\n1-EKLEME\n2-ARAMA\n3-LİSTELEME\n4-SİLME\n5-ANA MENÜ\nQ-ÇIKIŞ");
		System.out.println("Seciminiz: ");
		String secim = scan.next();
		switch (secim) {
		case "1":
			o.ekle();

			break;
		case "2":
			o.ara();
			break;
		case "3":
			o.listele();
			break;
		case "4":
			o.sil();
			break;
		case "5":
			menu();
			break;
		case "Q":
			cikis();
			break;

		default:
			System.out.println("Hatali giriş");
			break;
		}

	}
	public void ogretmenIslemBilgileri() {
		System.out.println(
				"========== OGRETMEN ISLEMLER ==========\n1-EKLEME\n2-ARAMA\n3-LİSTELEME\n4-SİLME\n5-ANA MENÜ\nQ-ÇIKIŞ");
		System.out.println("Seciminiz: ");
		String secim = scan.next();
		switch (secim) {
		case "1":
			oo.ekle();

			break;
		case "2":
			oo.ara();
			break;
		case "3":
			oo.listele();
			break;
		case "4":
			oo.sil();
			break;
		case "5":
			menu();
			break;
		case "Q":
			cikis();
			break;

		default:
			System.out.println("Hatali giris");
			break;
		}

	}
	private void cikis() {
		System.out.println("çikiş yapilmiştir");

	}

}