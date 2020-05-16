package entities1;

public class Rectangle {

	public double width;
	public double height;
	public double comp;

	public double Area() {
		return width * height;
	}

	public double Perimeter() {
		return (width + width) + (height + height);
	}

	public double Diagonal() {
		return Math.sqrt((width * width) + (height * height));
		 
	}

	
	public String toString() { 
		return "AREA = " 
				+ String.format("%.2f", Area())
				+ " PERIMETER = " 
				+ String.format("%.2f", Perimeter())
				+ " DIAGONAL = " 
				+ String.format("%.2f", Diagonal());
	}
	 

}
