package ua.itea.lesson8HomeWork;

import java.util.Scanner;

public class Circle {
	private int id = 3;
	private double pi = 3.14159265359;
	Agregator aggregator = new Agregator();
	
	private double userIn() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		double in = input.nextDouble();
		return in;
		}


	private double calcPer(double a, double pi) {
		double per = 2 * a* pi;
		return per;
	}

	private double calcArea(double a, double pi) {
		double area = pi * (a * a);
		return area;
	}
	
	public void printInfo() {
		System.out.println("Id: " + id + ": You chose a circle.");
		System.out.println("Please radius: ");
		double a = userIn();
		System.out.println("Perimeter is: " + calcPer(a, pi)  + "\n"+ "Areas is: " + calcArea(a, pi));
		aggregator.getText();
	}


}
