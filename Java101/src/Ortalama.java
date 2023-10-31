import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz? ");
        int n = scanner.nextInt();

        double harmonikSerisi = 0;

        for (int i = 1; i <= n; i++) {
            harmonikSerisi += 1.0 / i;
        }

        double harmonikOrtalama = n / harmonikSerisi;

        System.out.println("Girilen sayıların harmonik ortalaması: " + harmonikOrtalama);
    }
}   