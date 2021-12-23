package Hastaneprojesi;

public class HastaneRunner {
	private static Hastane hastane = new Hastane();
	
	public static void main(String[] args) {

		String hastaDurumu="Bas agrisi";
		String unvan=doktorUnvan(hastaDurumu);
		
		hastane.setDoktor(doktorBul(unvan));
		hastane.setHasta(hastaBul(hastaDurumu));
		
		System.out.println("Doktor ismi: "+hastane.getDoktor().getAd());
		System.out.println("Doktor Soyisim: "+hastane.getDoktor().getSoyad());
		System.out.println("Doktor Unvani: "+hastane.getDoktor().getUnvan());
		System.out.println("Hasta Adi: "+hastane.getHasta().getAd());
		System.out.println("Hasta Soyadi: "+hastane.getHasta().getSoyad());
		System.out.println("Hasta Durumu: "+hastaDurumu);
		
		
		
	}

	public static String doktorUnvan(String aktuelDurum) {
		if (aktuelDurum.equals("Allerji")) {
			return hastane.unvanlar[0];
		}
		if (aktuelDurum.equals("Bas agrisi")) {
			return hastane.unvanlar[1];
		}
		if (aktuelDurum.equals("Diabet")) {
			return hastane.unvanlar[2];
		}
		if (aktuelDurum.equals("Soguk alginligi")) {
			return hastane.unvanlar[3];
		}
		if (aktuelDurum.equals("Migren")) {
			return hastane.unvanlar[4];
		}
		if (aktuelDurum.equals("Kalp hastaliklari ")) {
			return hastane.unvanlar[5];
		}
		return "yanlis durum";
	}
	public static Doktor doktorBul(String unvan){ 
		Doktor doktor= new Doktor();
		for (int i = 0; i < hastane.unvanlar.length; i++) {
			if (unvan.equals(hastane.unvanlar[i])) {
				doktor.setAd(hastane.doctorIsimleri[i]);
				doktor.setSoyad(hastane.doctorSoyIsimleri[i]);
				doktor.setUnvan(unvan);
			}
		}

		return doktor;
	}
	public static Durum hastaDurumuBul(String aktuelDurum) {
		Durum hastaDurumu = new Durum();
		switch (aktuelDurum) {
		case " Allerji":
			hastaDurumu.setAciliyet(false);
			break;
		case " Bas agrisi":
			hastaDurumu.setAciliyet(false);
			break;
		case " Diabet": 
			hastaDurumu.setAciliyet(false);
			break;
		case " Soguk alginligi": 
			hastaDurumu.setAciliyet(false);
			break;
		case " Migren": 
			hastaDurumu.setAciliyet(true);
			break;
		case " Kalp hastaliklari":
			hastaDurumu.setAciliyet(true);
			break;
		default:
		System.out.println("Gecerli bir durum degil");
		break;
		}
		return hastaDurumu;
	}
	public static Hasta hastaBul(String actualCase) {
		Hasta hasta = new Hasta();
		for (int i = 0; i < hastane.durumlar.length; i++) {
			if (actualCase.equals(hastane.durumlar[i])) {
				hasta.setAd(hastane.hastaIsimleri[i]);
				hasta.setSoyad(hastane.hastaSoyIsimleri[i]);
				hasta.setHastaId(hastane.hastaIDleri[i]);
				hastaDurumuBul(actualCase);
				hasta.setHastaDurumu(null);
						
			}
		}
		
		return hasta;

	}

}
