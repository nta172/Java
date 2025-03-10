package backend;

public class Student {
	// a) Tất cả các property sẽ để là private để các class khác không chỉnh sửa hay nhìn thấy 
	private int id;
	private String name;
	private String hometown;
	private float score;
	
	/*
	 * Tạo constructor cho phép khi khởi tạo mỗi student thì người dùng sẽ nhập vào
	 * tên, hometown và có điểm học lực = 0
	 */
	public Student(String name, String hometown) {
		this.name = name;
		this.hometown = hometown;
		this.score = (float) 0;
	}
	
	// Tạo 1 method cho phép set điểm vào 
	public void setScore(float score) {
		this.score = score;
	}
	
	// Tạo 1 method cho phép cộng thêm điểm 
	public void setPlusScore(float score) {
		this.score = this.score + score;
	}
	
	/*
	 * Tạo 1 method để in ra thông tin của sinh viên bao gồm có tên, điểm học lực (
	 * nếu điểm <4.0 thì sẽ in ra là Yếu, nếu điểm > 4.0 và < 6.0 thì sẽ in ra là
	 * trung bình, nếu điểm > 6.0 và < 8.0 thì sẽ in ra là khá, nếu > 8.0 thì in ra
	 * là Giỏi)
	 */
	
	@Override
	public String toString() {
		String rank = null;
		if(this.score < 4.0) {
			rank = "Yếu";
		}else if(this.score < 6.0) {
			rank = "Trung bình";
		}else if(this.score < 8.0) {
			rank = "Khá";
		}else {
			rank = "Giỏi";
		}
		return "Student [id = " + id + ", name = " + name + ", hometown = " + 
		hometown + ", score = " + score + ", Xếp loại = " + rank + "]";	}
}
