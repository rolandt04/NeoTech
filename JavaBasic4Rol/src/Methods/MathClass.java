package Methods;

public class MathClass {

	int a, b;

	void calculus(int a, int b) {

		System.out.println(b * 5 + "is the largest number");

	}

	public static void main(String[] args) {

		MathClass addition = new MathClass();

		addition.calculus(5, 6);

	}
}