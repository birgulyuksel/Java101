import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        String input;
        
        //Program sürekli sormaya devam etsin diye while(true) yaptım.

        while (true) {
        	
        	//Kullanıcıdan input alma işlemi
        	
            System.out.print("Enter the number of lines (q for quit): ");
            input = scanner.nextLine();
            
            //Eğer kullanıcı q girerse programı sonlandır.String ifadeleri .equals ile sorgularız.

            if (input.equalsIgnoreCase("q")) {
                break;
            }
            
            //Kullanıcın girdiği sayıyı integer'a dönüştürmek için parseInt kullandım.

            int n = Integer.parseInt(input);
            
            //İstenilen pattern için nested loops kullandım.

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print("   ");
                }

                for (int j = i; j >= 1; j--) {
                	if(j>=10) { //Kullanıcı iki basamaklı sayı girerse tek boşluk(üçgen yapıyı korumak için)
                		System.out.print(j + " ");
                	}else { // tek basamaklıysa iki boşluk
                		System.out.print(j + "  ");
                	}
                    
                }

                for (int j = 2; j <= i; j++) {
                	if(j>=10) { //Kullanıcı iki basamaklı sayı girerse tek boşluk(üçgen yapıyı korumak için)
                		System.out.print(j + " ");
                	}else { //tek basamaklıysa iki boşluk
                		System.out.print(j + "  ");
                	}
                    
                }

                System.out.println();
            }
        }
        
        //q girilirse çıkacak olan yazı.

        System.out.println("Program Terminates.");
        scanner.close();
    }
}
