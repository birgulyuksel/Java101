import java.util.Scanner;

public class Odev11 {
	
	public static boolean isPalindrome(String str)
    {
        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0;
        int j = str.length() - 1;
 
        // While there are characters to compare
        while (i < j) {
 
            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
            {
                return false;
            }
 
            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }
 
        // Given string is a palindrome
        return true;
    }
	public static String reverse(String str)
	{
		String reverse="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse+=str.charAt(i);
		}
		
		return reverse;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		String input;
		
		while(true)
		{
			System.out.println("Enter String");
			input= scan.nextLine().trim();
			
			if(isPalindrome(input))
			{
				System.out.println("String is palindrome");
			}
			else {
				System.out.println("String is NOT palindrome");
				
			}
			
			System.out.println("reversed input: "+reverse(input));
		
		}

	}

}
