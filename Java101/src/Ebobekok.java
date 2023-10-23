import java.util.Scanner;

public class Ebobekok {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("n1 sayısını giriniz: ");
		int n1 = input.nextInt();
		
		System.out.print("n2 sayısını giriniz: ");
		int n2 = input.nextInt();
		System.out.println("-------EKOK KISMI---------");
		int j = 1;
		
		while(j <= (n1*n2)) {
			if(j % n1 == 0 && j % n2 == 0) {
				System.out.println(j);
				break;
			}
			j++;
		}
		
		
		
		System.out.println("\n-------EBOB KISMI---------");
		int ebob=1;
		
		int i=1;
		while (i <= n1) {
			if(n1 % i == 0 && n2 % i == 0) {
				System.out.println(i);
				ebob = i;
				
			}
			i++;
		}
		System.out.println("============");
		int k = n1;
		while(k >=1) {
			if(n1 % k == 0 && n2 % k == 0) {
				ebob = k;
				System.out.println(ebob);
				break;
			}
			
			k--;
		}
	

	}

}
