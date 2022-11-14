package lesson12;

public class ArrayClassExcersise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] numbers = { { 1, 2, 3, 4, 5 }, { 4, 5, 6, 7 }, { 9, 8, 7 } };

		for (int row = 0; row < numbers.length; row++) {
			for (int col = 0; col < numbers[row].length; col++) {
				System.out.print(numbers[row][col] + " ");
			}
			System.out.println("");
		}

	}

}
