package loops;

public class Loops {

	public static void main(String[] args) {

		int a = 1;

		for (a = 1; a <= 50; a++) {
			if (a % 2 == 0) {
				continue;
			}

			System.out.print(a + " ");

		}
		System.out.print(".");
	}
}