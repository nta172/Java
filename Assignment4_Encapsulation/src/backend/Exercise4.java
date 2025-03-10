package backend;

public class Exercise4 {
	public void printStudent() {
		Student st1 = new Student("name1", "H1");
		st1.setPlusScore(1f);
		
		Student st2 = new Student("name2", "H2");
		st2.setPlusScore(5f);
		
		Student st3 = new Student("name3", "H3");
		st3.setPlusScore(8f);
		
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
	}
}
