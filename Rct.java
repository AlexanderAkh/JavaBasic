package ua.itea.lesson8HomeWork;

import java.util.Scanner;

public class Rct {
	private int id = 1;
	Agregator aggregator = new Agregator();

private double userIn() {
	@SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
	double in = input.nextDouble();
	return in;
}

	public void printInfo() {
		System.out.println("Id: " + id + ": You chose a rectangle.");
		System.out.println("Please input side - a: ");
		double a = userIn();
		System.out.println("Please input side - b: ");
		double b = userIn();
		System.out.println("Perimeter is: " + calcPer(a, b)  + "\n"+ "Areas is: " + calcArea(a, b));
		System.out.println("End");
		aggregator.getText();
	}
	

	private double calcPer(double a, double b) {
		double per = (a + b) * 2;
		return per;
	}

	private double calcArea(double a, double b) {
		double area = (a * b);
		return area;
	}
}
