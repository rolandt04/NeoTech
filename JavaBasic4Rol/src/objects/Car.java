package objects;

public class Car {

	String brand, make, model;
	int year, mileage, price;

	void drives() {
		System.out.println(brand + " " + make + " " + model + " " + "drives very fast");
	}

	void stop() {
		System.out.println(brand + make + model + year + price + "drives very fast");
	}

	void flies() {
		System.out.println(brand + " " + make + " " + model + " " + "" + "" + "drives very fast");
	}

}