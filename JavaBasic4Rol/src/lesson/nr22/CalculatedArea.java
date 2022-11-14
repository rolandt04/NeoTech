package lesson.nr22;

public class CalculatedArea {

	public CalculatedArea(int i, int j) {
		// TODO Auto-generated constructor stub
	}

	double area(double a, double b) {
		return a * b;
	}

	double area(double a, double b, double c) {
		return a * b * c;
	}

	double area(double a, double b, double c, double d) {
		return a * b * c * d;
	}

}

class AreaResults extends CalculatedArea {

	CalculatedArea are = new CalculatedArea(5, 6);

	public static void main(String[] args) {
		CalculatedArea are = new CalculatedArea(5, 6);
		System.out.println("let me win" + "" + "" + "" + "" + "" + "" + "" + "" + "" + "" + "" + "" + "" + "");
	}
}