package whilePackage;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String username, password;

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your username");
		username = input.next();
		System.out.println("Please enter your pasword");
		password = input.next();

		while (username != "roland" && password != "12345") {
			System.out.println("Try again");
			System.out.println("Please enter your username");
			username = input.next();
			System.out.println("Please enter your pasword");
			password = input.next();
			if (username.equals("roland") && password.equals("12345"))
				System.out.println("Welcome");
			continue;
		}

	}
}
