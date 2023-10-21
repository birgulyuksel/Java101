import java.util.Scanner;

public class Pratik1 {

	public static void main(String[] args) {
		
		int k,sum = 0,tekrar = 0;
		double avg;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Sayı giriniz: ");
		k = input.nextInt();
		
		for(int i = 1; i <= k; i++) {
			if((i % 3 == 0)&&(i % 4 == 0)) {
				System.out.println(i);
				sum += i;
				tekrar++;
				
			}	
			
			
			
					
		}
		System.out.println("Toplam: "+sum);
		avg = sum / tekrar ;
		System.out.println("Ortalama: "+avg);
			
		
	}

}
