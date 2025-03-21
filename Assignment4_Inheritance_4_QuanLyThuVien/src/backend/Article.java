package backend;

import java.time.LocalDate;

public class Article extends Document {
	private LocalDate dayRelease; 
	
	public Article(int id, String publisher, int numRelease, LocalDate dayRelease) {
		super(id, publisher, numRelease);
		this.dayRelease = dayRelease;
	}

	public String toString() {
		return super.toString() + "Category : Article [dayRelease = " + dayRelease + "]";
	}
}
