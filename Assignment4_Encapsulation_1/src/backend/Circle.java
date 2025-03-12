package backend;

public class Circle {
	private double radius;
	private String color;
	
	public static final Double PI = 3.14;
	
	//Circle
	public Circle() {
		
	}
	
	public Circle (double radius) {
		this.radius = radius;
	}
	
	public Circle (double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	//Radius
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//Color
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public Double getArea() {
		return PI * Math.pow(this.radius, 2.0);
	}
	
	@Override
	public String toString() {
		return "Circle[radius = " + radius + " , color = " + color + "]";
	}
}
