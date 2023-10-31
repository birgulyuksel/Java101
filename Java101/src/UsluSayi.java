import java.util.Scanner;
public class UsluSayi {
	
	static int pow(int a , int b) {
		int result=1;

		if(b==0) {
			return result;
		}
		else
		return a * pow(a,b-1);
	}

	public static void main(String[] args) {		Scanner scan = new Scanner(System.in);
		System.out.print("Taban değeri giriniz: ");
		int a = scan.nextInt();
		System.out.print("Üs değeri giriniz: ");
		int b = scan.nextInt();
		System.out.println("Sonuç: " + pow(a,b));

        System.out.println();


	}

}
