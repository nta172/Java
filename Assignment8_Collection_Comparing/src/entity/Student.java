package entity;

import java.time.LocalDate;

public class Student implements Comparable<Student> {

	public static int COUNT = 0;
	private int id;
	private String name;
	private LocalDate birthDay;
	private float score;

	public Student(String name, LocalDate birthDay, float score) {
		++COUNT;
		this.id = COUNT;
		this.name = name;
		this.birthDay = birthDay;
		this.score = score;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}

	public float getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "StudentEx2 [id = " + id + ", name = " + name + ", birthDay = " + birthDay + ", score = " + score + "]";
	}

	@Override
	public int compareTo(Student o) {
		int flagCompare = this.name.compareTo(o.getName());
		if (flagCompare == 0) {
			if (this.score > o.score) {
				return 1;
			} else if (this.score < o.score) {
				return -1;
			} else if (this.score == o.score) {
				return this.birthDay.compareTo(o.getBirthDay());
			}
		} else {
			return flagCompare;
		}
		return 0;
	}

}
