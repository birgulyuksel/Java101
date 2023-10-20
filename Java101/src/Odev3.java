import java.util.Scanner;
public class Odev3 {

	public static void main(String[] args) {
		//Değişkenleri oluşturalım
		int a,b,c;
		int cevre,u;
		double alan;
		
		
		//Kullanıcıdan verileri alma
		Scanner girdi = new Scanner(System.in);
		System.out.print("1.Kenarı giriniz: ");
		a = girdi.nextInt();
		System.out.print("2.Kenarı giriniz: ");
		b = girdi.nextInt();
		System.out.print("3.Kenarı giriniz: " );
		c = girdi.nextInt();
		
		//Çevre hesabı
		cevre = a + b + c ;
		u = cevre / 2 ;
		alan = Math.sqrt(u * (u-a)*(u-b)*(u-c));
		System.out.print("Alan: " + alan );
				
		
		
		
		
		

	}

}
