import java.util.Scanner;
public class MinMax {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Kaç tane sayı gireceksiniz: ");
		int total = input.nextInt();
		int max=0;
		int min=0;
		for(int i = 1; i <= total; i++) {
			System.out.println(i + ". sayıyı giriniz: ");
			int number  = input.nextInt();
			if(i==1) {
				max = number;
				min = number;
			}else {
				if(number>max) {
					max = number;
				}
				if(number<min) {
					min=number;

				}
			}
		}
		System.out.println("En büyük sayı: "+ max);
		System.out.println("En küçük sayı: "+ min);

	}

}
