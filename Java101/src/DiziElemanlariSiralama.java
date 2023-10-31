import java.util.Arrays;
import java.util.Scanner;

public class DiziElemanlariSiralama {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Dizinin boyutu : ");
		int number = input.nextInt();

		int[] list = new int[number];
		for (int i = 0; i < list.length; i++) {
			System.out.print(i + 1 + ".Elemanı : ");
			list[i] = input.nextInt();
		}
		Arrays.sort(list);
		System.out.println("Sıralama : " + Arrays.toString(list));
	}
}