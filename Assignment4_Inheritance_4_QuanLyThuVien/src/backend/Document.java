package backend;

public class Document {
	private int id;
	private String publisher; // publisher : nhà xuất bản
	private int numRelease; // numRelease : số bản phát hành

	public Document(int id, String publisher, int numRelease) {
		this.id = id;
		this.publisher = publisher;
		this.numRelease = numRelease;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
	return "Document [id = " + id + ", publisher = " + publisher + ", numRelease = " + numRelease + "]";
	}
}
