package arrayClassSorular;

import java.util.Arrays;
import java.util.Scanner;

public class Q_011_B {
	
	static Scanner scan = new Scanner(System.in);
	static int elemanSayisi=0;
	
	public static void main(String[] args) {
		
		/*
		 * Create a function that takes an array and returns the difference between and
		 * the smallest numbers. Ask user to enter array elements.
		 * 
		 * kullanıcının girdigi bir array'in en buyuk elemani ile en kucuk elemanının
		 * farkını bulan bir method create ediniz.
		 */
		
		System.out.println("Gireceginiz array'in eleman sayisini giriniz : ");
		elemanSayisi = scan.nextInt();
		Integer arr[] = new Integer[elemanSayisi];
		
		System.out.println("Max ve Min sayinin farki : "+fark(arr));
		
		}

	private static int fark(Integer[] arr) {
		for (int i = 0; i < elemanSayisi; i++) {			
			System.out.print("Array'in " + i + ". elemanini giriniz : ");
			arr[i] = scan.nextInt();
			
		}
		
		System.out.println("Array listesi : "+Arrays.toString(arr));
		
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		int farki=max-min;
		
		
		return farki;
	}
}
