package lewis_p1;

import java.util.Scanner;

public class lewis_p1_encrypt {

	public static void main(String[] args) {
		//Set up scanner
		Scanner scnr = new Scanner(System.in);
				
		//Create int's to save each new digit
		int firstDigitNew;
		int secondDigitNew;
		int thirdDigitNew;
		int fourthDigitNew;
		
		//Collect password from user input
		System.out.print("Please enter a 4-digit password: ");
		int userCode = scnr.nextInt();
				
		//Create new digits
		firstDigitNew = ((userCode / 1000) + 7) % 10;
		secondDigitNew = (((userCode / 100) % 10) + 7) % 10;
		thirdDigitNew = (((userCode / 10) % 10) + 7) % 10;
		fourthDigitNew = ((userCode  % 10) + 7) % 10;
				
		/* Test output BEFORE rearranging letters:
		System.out.println("" + firstDigitNew + secondDigitNew + thirdDigitNew + fourthDigitNew);
		*/
				
		//Output encrypted password
		System.out.println("Encrypted Password: " + thirdDigitNew + fourthDigitNew + firstDigitNew + secondDigitNew);

	}

}
