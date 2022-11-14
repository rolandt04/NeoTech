package lesson.constructor;

public class Student {
	private static Student c4;

	{
		// TODO Auto-generated constructor stub
	}

//	Write a java program of Class Students that takes students
//	name and 3 subject grades. Inside your class also have a
//	method to Calculate Average Grade. Test Student class for 5
//	different students with different marks. Your program should
//	print an average mark of each students name.

	public Student(String studentName, double studentMathGrade, double studentHistoryGrade,
			double studentLiteratureGrade) {
		double average = (studentMathGrade + studentHistoryGrade + studentLiteratureGrade) / 3;
		System.out.println(studentName + " has an average " + average);
	}

	public static void main(String[] args) {

		Student ci = new Student("Daniel", 80, 60, 45);
		Student c2 = new Student("Roland", 90, 50, 45);
		Student c3 = new Student("Daniela", 80, 50, 45);
		c4 = new Student("Klaudia", 80, 80, 45);
		Student c5 = new Student("Stefi", 80, 70, 45);

	}

}
