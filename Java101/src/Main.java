import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Değişkenleri oluştur
		int mat,fizik,kimya,turkce,tarih,muzik;
		
		try (//Scanner sınıfını tanımladık
		Scanner deger = new Scanner(System.in)) {
			//Kullanıcıdan değerleri al
			System.out.print("Matematik Notunuz: ");
			mat= deger.nextInt();
			
			System.out.print("Fizik Notunuz: ");
			fizik= deger.nextInt();
			
			System.out.print("Kimya Notunuz: ");
			kimya= deger.nextInt();
			
			System.out.print("Türkçe Notunuz: ");
			turkce= deger.nextInt();
			
			System.out.print("Tarih Notunuz: ");
			tarih= deger.nextInt();
			
			System.out.print("Müzik Notunuz: ");
			muzik= deger.nextInt();
		}
		
		double ortalama;
		ortalama = (mat + fizik + kimya + turkce + tarih + muzik)/ 6;
		
		System.out.print("Ortalamanız: " + ortalama);
		System.out.print(ortalama <= 60 ? "\nKaldınız." : "\nGeçtiniz");
		
	}

}

