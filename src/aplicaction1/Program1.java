package aplicaction1;

import java.util.Locale;
import java.util.Scanner;

import entities1.Rectangle;

public class Program1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		System.out.print("Enter rectangle width and height: ");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.println();
		rectangle.Area();
		rectangle.Perimeter();
		rectangle.Diagonal();
		System.out.println(rectangle);
		
		sc.close();
	}

}
