import java.util.Scanner;
public class Scanner {


	​
		public static void main(String[] args) {
			// Import Scanner class
			// Windows -> ctrl + shift + o
			// MacOS -> command + shift + o
	​
			// declare a Scanner variable
			Scanner input = new Scanner(System.in);
	
	
	System.out.println("Please enter your name:");
	​
			// declare a variable to catch the user input
			String name = input.next();
			// write name on the screen
			System.out.println("Nice to meet you: " + name);
	​
			// declare an integer to catch the users age
			System.out.println("Please enter your age:");
			int age = input.nextInt();
			System.out.println("Your age is: " + age);
	​
			// declare a double to catch the users weight
			System.out.println("Please enter your weight:");
			double weight = input.nextDouble();
			System.out.println("Your weight is: " + weight);
	​
			// declare a double to catch the users weight
			System.out.println("Do you think it is going to rain today?");
			boolean willRain = input.nextBoolean();
			System.out.println("You think it is going to rain: " + willRain);
	​
			if (willRain) {
				System.out.println("Bring your umbrella with you!");
			} else {
				System.out.println("Enjoy the weather!");
			}
	​
		}

}
