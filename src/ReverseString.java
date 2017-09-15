import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter String to reverse: ");
		char[] input = sc.nextLine().toCharArray();
		sc.close();
		System.out.println(ReverseString.reverse(input));
	}
	
	public static String reverse(char[] input){
		
		for (int i = 0; i < input.length/2; i++) {
			char temp = input[i];
			input[i] = input[input.length-1-i];
			input[input.length-i-1] = temp;
		}
		return String.valueOf(input);
	}
}
