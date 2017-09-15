import java.util.Scanner;

public class FindPalindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter String to find palindrome or not : ");
		String input = sc.nextLine();
		System.out.println(input + " a "+ findPalindrome(input) +" Palindrome");
	}
	
	public static boolean findPalindrome(String input){
		
		String out = ReverseString.reverse(input.toCharArray());
		if(out.equals(input))
			return true;
		
		return false;
	}
}
