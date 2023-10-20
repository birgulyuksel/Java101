import java.util.Scanner;

public class Odev5 {

	public static void main(String[] args) {
	int radius;
	double cevre;
	double alan;
	double PI=3.14;
	double angle;
	
	Scanner input = new Scanner(System.in);
	System.out.print("Yarı çapını giriniz: ");
	radius= input.nextInt();	
	
	System.out.print("Açı giriniz: ");
	angle= input.nextDouble();
	
	alan= (PI * (radius * radius)* angle)/360;
	cevre= 2 * PI * radius;
	
	System.out.println("Alan: " + alan);
	System.out.println("Çevre: " + cevre);
	
	
	
	
	}

}
