package ua.itea.lesson8HomeWork;

import java.util.Scanner;

public class Trng {
	private int id = 2;
	Agregator aggregator = new Agregator();
	private double userIn() {
	@SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
	double in = input.nextDouble();
	return in;
	}

	private double calcPer(double a, double b, double c) {
		double per = a + b + c;
		return per;
	}

	private double calcArea(double a, double h) {
		double area = a/2 * h;
		return area;
	}
	
	public void printInfo() {
		System.out.println("Id: " + id + ": You chose a triangle.");
		System.out.println("Please input side - a: ");
		double a = userIn();
		System.out.println("Please input side - b: ");
		double b = userIn();
		System.out.println("Please input side - c: ");
		double c = userIn();
		System.out.println("Please input height base 'a' of trinagle: ");
		double h = userIn();
		System.out.println("Perimeter is: " + calcPer(a, b, c)  + "\n"+ "Areas is: " + calcArea(a, h));
		aggregator.getText();
		
	}

}
