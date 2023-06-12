// Anmoldeep Sandhu
// CST-105 : Project Programming 7
// This file and project are my own work
package programming7;

public class PrimePalindrome {

	// This is checking prime numbers.
	public static boolean isPrime(int num) {
		for (int i = 2; i < num; ++i) {
			if(num %i == 0) {
				return false;
			}
		}
		return true;
	}
	// This checking the palindrome numbers
	public static boolean isPalindrome(int num) {
		int original = num;
		int reversed = 0;
		// If number is smaller than 0 than this programme is going to work.
		while (num > 0) {
			reversed *=10;
			reversed +=(num%10);
			num /=10;
		}
		return original == reversed;
	}
	// Main to run the programme.
	public static void main(String[]args) {
		int count = 0;
		for(int i = 2; i <= 100000; ++i) {
			//This is printing if statement.
			if(isPalindrome(i) && isPrime(i)) {
				count++;
				System.out.println(i);
				if(count % 4 ==0) {
					System.out.println();
				}
			}
		}
	}

}
