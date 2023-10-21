import java.util.Scanner;

public class Odev8 {

	public static void main(String[] args) {
		int n1,n2,select;
		
		Scanner input = new Scanner(System.in);
		System.out.print("İlk Sayıyı Giriniz: ");
		n1= input.nextInt();
		System.out.print("İkinci Sayıyı Giriniz: ");
		n2= input.nextInt();
		
		System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
		System.out.print("Seçiniz: ");
		select = input.nextInt();
		
		switch (select) {
		case 1: System.out.println("Toplam: " + (n1+n2));
		break;
		case 2: System.out.println("Çıkarma: " + (n1-n2));
		break;
		case 3: System.out.println("Çarpım: " + (n1*n2));
		break;
		case 4: System.out.println("Bölüm " + (n1/n2));
		break;
		default: System.out.println("Hatalı Giriş");
		}
		
	}

}
