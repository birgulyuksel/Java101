import java.util.Scanner;
public class Pratik3 {

	public static void main(String[] args) {
		
		int deger;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Bir sayı giriniz: ");
		deger = input.nextInt();
		
		System.out.println("\n4'ün Kuvvetleri: \n");
		for(int i = 1; i<=deger; i*=4) {
			System.out.println(i);
			}
		System.out.println("\n5'in Kuvvetleri: \n");
		for(int i = 1; i<=deger; i*=5) {
			System.out.println(i);
			}

	}

}
