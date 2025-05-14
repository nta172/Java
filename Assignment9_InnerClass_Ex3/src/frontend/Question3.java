package frontend;

import backend.OuterClass;

public class Question3 {
	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		outerClass.show();
		OuterClass.InnerClass innerClass = outerClass.new InnerClass();
		innerClass.show();
	}
}
