//Kombinasyon Hesaplama

import java.util.Scanner;

public class Pratik4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Kombinasyon için n giriniz: ");
		int n = input.nextInt();
		System.out.println("Kombinasyon için r giriniz: ");
		int r = input.nextInt();
		int nTotal=1;
		int rTotal=1;
		int nrtotal=1;
		
		for(int i=1; i<= n ; i++) {
			nTotal = nTotal * i;
			
		}
		System.out.println("N Faktöriyel: " + nTotal);
		
		for(int i=1; i<= r ; i++) {
			rTotal = rTotal * i;
			
		}
		System.out.println("R Faktöriyel: " + rTotal);
		
		for(int i=1; i<= (n-r) ; i++) {
			nrtotal = nrtotal * i;
			
		}
		System.out.println("n-r Faktöriyel: " + nrtotal);
		
		System.out.println("C(n,r) =  " + (nTotal/(rTotal * nrtotal)));
			
		

	}

}
