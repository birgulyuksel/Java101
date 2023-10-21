import java.util.Scanner;

public class Odev14 {

	public static void main(String[] args) {
		int mesafe,yas,tip;
		int mesafeUcret;
		double ilkToplam,yasIndirimi,indirimliTutar,gidisIndirimi,toplamTutar;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Mesafe giriniz: ");
		mesafe = input.nextInt();
		System.out.print("Yaşınızı giriniz: ");
		yas = input.nextInt();
		System.out.print("Yolculuk tipi giriniz: (1-Tek Yön, 2-Gidiş/Dönüş) ");
		tip = input.nextInt();
		
		
		
		if((mesafe>0)&&(yas>0)&&((tip==1)||(tip==2))){
			if((yas<12)&&(tip==2)) {
				ilkToplam = mesafe * 0.10;
				yasIndirimi = ilkToplam * 0.50;
				indirimliTutar = ilkToplam - yasIndirimi;
				gidisIndirimi = indirimliTutar * 0.20;
				toplamTutar = (indirimliTutar - gidisIndirimi)*2;
				System.out.println("İndirimli Tutar: " + toplamTutar);
			}else if ((yas<12)&&(tip==1)) {
				ilkToplam = mesafe * 0.10;
				yasIndirimi = ilkToplam * 0.50;
				indirimliTutar = ilkToplam - yasIndirimi;
				System.out.println("Toplam Tutar: " + indirimliTutar );
			}
			if((12 <= yas)&& (yas <= 24)&&(tip==2)) {
				ilkToplam = mesafe * 0.10;
				yasIndirimi = ilkToplam * 0.10;
				indirimliTutar = ilkToplam - yasIndirimi;
				gidisIndirimi = indirimliTutar * 0.20;
				toplamTutar = (indirimliTutar - gidisIndirimi)*2;
				System.out.println("İndirimli Tutar: " + toplamTutar);
			}else if ((12 <= yas)&& (yas <= 24)&&(tip==1)) {
				ilkToplam = mesafe * 0.10;
				yasIndirimi = ilkToplam * 0.10;
				indirimliTutar = ilkToplam - yasIndirimi;
				System.out.println("Toplam Tutar: " + indirimliTutar );
			}
			if((24<yas)&&(yas<65)&&(tip==2)) {
				ilkToplam = mesafe * 0.10;
				yasIndirimi = ilkToplam * 0;
				indirimliTutar = ilkToplam - yasIndirimi;
				gidisIndirimi = indirimliTutar * 0.20;
				toplamTutar = (indirimliTutar - gidisIndirimi)*2;
				System.out.println("İndirimli Tutar: " + toplamTutar);
			}else if ((24<yas)&& (yas<65) &&(tip==1)) {
				ilkToplam = mesafe * 0.10;
				yasIndirimi = ilkToplam * 0;
				indirimliTutar = ilkToplam - yasIndirimi;
				System.out.println("Toplam Tutar: " + indirimliTutar );
			}
			
			if((65 <= yas)&&(tip==2)) {
				ilkToplam = mesafe * 0.10;
				yasIndirimi = ilkToplam * 0.30;
				indirimliTutar = ilkToplam - yasIndirimi;
				gidisIndirimi = indirimliTutar * 0.20;
				toplamTutar = (indirimliTutar - gidisIndirimi)*2;
				System.out.println("İndirimli Tutar: " + toplamTutar);
			}else if ((65 <= yas)&&(tip==1)) {
				ilkToplam = mesafe * 0.10;
				yasIndirimi = ilkToplam * 0.30;
				indirimliTutar = ilkToplam - yasIndirimi;
				System.out.println("Toplam Tutar: " + indirimliTutar );
			}
			
		}else {
			System.out.println("Hatalı Veri Girdiniz!");
		}
	}

}
