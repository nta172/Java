package frontend;

import backend.Group;
import backend.InvalidAgeInputingException;

public class DemoAccountInGroup {
	public static void main(String[] args) throws InvalidAgeInputingException {
		System.out.println("Tạo Group : ");
		Group gp = new Group();
		gp.printInfoGroup();
	}
}
