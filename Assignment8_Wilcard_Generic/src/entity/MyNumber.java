package entity;

public class MyNumber<N extends Number> {
	private N number;

	public MyNumber(N number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "MyNumber{" + "number=" + number + '}';
	}

	@SuppressWarnings("unchecked")
	public int compare(N a, N b) {
		if (!(a instanceof Comparable)) {
			throw new UnsupportedOperationException();
		}
		return ((Comparable<N>) a).compareTo(b);
	}

}
