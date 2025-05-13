package backend;

import entity.MyMath;
import entity.MyNumber;
import entity.Salary;

public class Exercise4 {
	public void question1() {
		Salary<Integer> salary = new Salary<Integer>(3000);
		print(salary);
	}

	public void question2() {
		MyNumber<Double> number = new MyNumber<Double>(6900.900);
		System.out.println(number);
	}

	public void question3() {
		MyMath<Integer> math = new MyMath<>();
		// Integer
		int maxInt = math.maximum(1, 10, 8);
		System.out.println(maxInt);
		// float
		float maxFloat = math.maximum(1.5f, 10.3f, 10.2f);
		System.out.println(maxFloat);
	}

	private <T> void print(T a) {
		System.out.println(a);
	}
}
