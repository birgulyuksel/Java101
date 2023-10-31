import java.util.Scanner;

public class PalindromSayilar {
	
	static boolean isPalindrom(int input) {
		int temp,tersSayi = 0,kalan;
		temp = input;;
		
		while(temp !=0) {
			kalan = temp % 10;
			tersSayi = tersSayi * 10 + kalan;
			temp /= 10;
		}
		if(input == tersSayi) {
			System.out.println("Bu bir palindrom sayıdır.");
			return true;
		}
		else
			System.out.println("Bu bir palindrom sayı değildir.");;
			return false;
	}

	public static void main(String[] args) {
		
		System.out.print("Bir sayı giriniz: ");
		Scanner inp = new Scanner(System.in);
		int input = inp.nextInt();
	    System.out.println(isPalindrom(input));
	    // 121 % 10 = 1 tersSayi = 1, 121/10 = 12
		// 12 % 10 = 2, tersSayi = tersSayi * 10 +2 = 12, 12/10 =1
		// 1 % 10 = 1, tersSayi = tersSayi * 10 +1 = 121, 1/10 = 0

	}

}
