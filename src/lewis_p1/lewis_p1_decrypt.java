package lewis_p1;

import java.util.Scanner;

public class lewis_p1_decrypt {

	public static void main(String[] args) {
		//Set up scanner
		Scanner scnr = new Scanner(System.in);
		
		//Create int's to save each decrypted digit
		int firstDigitOld;
		int secondDigitOld;
		int thirdDigitOld;
		int fourthDigitOld;
		
		//Collect encrypted from user input
		System.out.print("Please enter a 4-digit encrypted password: ");
		int encryptedCode = scnr.nextInt();
		
		//Decrypt each digit
		firstDigitOld = ((encryptedCode / 1000) + 3) % 10;
		secondDigitOld = (((encryptedCode / 100) % 10) + 3) % 10;
		thirdDigitOld = (((encryptedCode / 10) % 10) + 3) % 10;
		fourthDigitOld = ((encryptedCode  % 10) + 3) % 10;
		
		/* Test output BEFORE rearranging letters:
		System.out.println("" + firstDigitNew + secondDigitNew + thirdDigitNew + fourthDigitNew);
		*/
		
		//Output decrypted password
		System.out.println("Decrypted Password: " + thirdDigitOld + fourthDigitOld + firstDigitOld + secondDigitOld);


	}

}
