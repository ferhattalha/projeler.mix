package laptopproject;

public class Indirim {
	
	static int indirim;
	
	public static int indirimOrani(int toplam) {
		
		if(toplam > 8500) {
			indirim=30;
		} else if(toplam >7000) {
			indirim =20;
		}else if(toplam >4500) {
			indirim=10;
		}
		return indirim;
	}
	

}
