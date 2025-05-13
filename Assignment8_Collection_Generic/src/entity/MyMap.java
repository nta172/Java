package entity;

public class MyMap<K, V> {
	protected K id;
	protected V name;
	
	public MyMap(K id, V name) {
		super();
		this.id = id;
		this.name = name;
	}

	public K getId() {
		return id;
	}

	public void setId(K id) {
		this.id = id;
	}

	public V getName() {
		return name;
	}

	public void setName(V name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [id = " + id + ", name = " + name + "]";
	}
}
