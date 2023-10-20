import java.util.Scanner;

public class Odev7 {

	public static void main(String[] args) {
		double armut,elma,domates,muz,patlican;
		double tutar;
		
		System.out.print("Meyveler ve KG Fiyatları\r\n"
				+ "\r\n"
				+ "Armut : 2,14 TL\r\n"
				+ "Elma : 3,67 TL\r\n"
				+ "Domates : 1,11 TL\r\n"
				+ "Muz: 0,95 TL\r\n"
				+ "Patlıcan : 5,00 TL\n\n");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Armut Kaç Kilo? : ");
		armut = input.nextDouble();
		System.out.print("Elma Kaç Kilo? : ");
		elma = input.nextDouble();
		System.out.print("Domates Kaç Kilo? : ");
		domates = input.nextDouble();
		System.out.print("Muz Kaç Kilo? : ");
		muz = input.nextDouble();
		System.out.print("Patlıcan Kaç Kilo? : ");
		patlican = input.nextDouble();
		
		tutar = (armut * 2.14) + (elma * 3.67) + (domates * 1.11) + (muz * 0.95) + (patlican * 5);
		System.out.print("Toplam Tutar : " + tutar + "TL");
		
		
		
	
		
	}

}
