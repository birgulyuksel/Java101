import java.util.Scanner;

public class Odev10 {

	public static void main(String[] args) {
		int mat,fizik,turkce,kimya,muzik;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Matematik Notunuz: ");
		mat = input.nextInt();
		
		System.out.print("Fizik Notunuz: ");
		fizik = input.nextInt();
		
		System.out.print("Türkçe Notunuz: ");
		turkce = input.nextInt();
		
		System.out.print("Kimya Notunuz: ");
		kimya = input.nextInt();
		
		System.out.print("Müzik Notunuz: ");
		muzik = input.nextInt();
		
		double average = (mat + fizik + turkce + kimya + muzik)/ 5 ;
		
		if( (0 <= mat && mat <=100) && (0 <= fizik && fizik <=100) && (0 <= turkce && turkce <=100) && (0 <= kimya && kimya <=100) && (0 <= muzik && muzik <=100) ) {
			if(average <=55) {
			System.out.println("Sınıfta kaldınız! ");
			System.out.println("Ortalamanız: " + average);
		}else {
			System.out.println("Tebrikler,geçtiniz!");
			System.out.println("Ortalamanız: " + average);
		}
		}else {
			System.out.println("Lütfen 0-100 arası not giriniz! ");
		}
		
		
	
	}

}
