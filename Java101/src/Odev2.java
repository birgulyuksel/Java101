import java.util.Scanner;

public class Odev2 {

	public static void main(String[] args) {
		double tutar,kdvOran, kdvTutar,kdvliTutar;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Ücret Tutarını Giriniz: ");
		
		tutar = input.nextDouble();
		
		if ( 0< tutar && tutar < 1000) {
			kdvOran = 0.18;
			kdvTutar= tutar * kdvOran;
			kdvliTutar = tutar + kdvTutar;
			System.out.println("KDV Oranı: " + kdvOran);
			System.out.println("KDV Tutarı: " + kdvTutar);
			System.out.println("KDVli Tutar: " + kdvliTutar);
		}
		else if(tutar> 1000) {
			kdvOran= 0.08;
			kdvTutar= tutar * kdvOran;
			kdvliTutar = tutar + kdvTutar;
			System.out.println("KDV Oranı: " + kdvOran);
			System.out.println("KDV Tutarı: " + kdvTutar);
			System.out.println("KDVli Tutar: " + kdvliTutar);
		}
		
		System.out.println("KDVsiz Tutar : " + tutar);

		
	}

}
