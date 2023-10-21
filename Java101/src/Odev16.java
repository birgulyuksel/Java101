import java.util.Scanner;

public class Odev16 {

	public static void main(String[] args) {
		int yil;
		double bolum1,bolum2,bolum3;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Yıl giriniz: ");
		yil = input.nextInt();
		
		bolum1 = yil % 4;
		bolum2 = yil % 100;
		bolum3= yil % 400;
		
		if((bolum1 == 0) && (bolum2== 0)&&(bolum3 == 0)) {
			System.out.println(yil + " bir artık yıldır!");
		}else if ((bolum1 == 0) && (bolum2== 0)&&(bolum3 != 0)) {
			System.out.println(yil + " bir artık yıl değildir!");
		}else if ((bolum1==0)&&(bolum2!=0)) {
			System.out.println(yil + " bir artık yıldır!");
		}else {
			System.out.println(yil + " bir artık yıl değildir!");
		}
				
		
	}

}
