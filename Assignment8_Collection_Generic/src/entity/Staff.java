package entity;

public class Staff<K, V> extends MyMap<Object, Object>{

	public Staff(Object id, Object name) {
		super(id, name);
	}
	
	public Object getId() {
		return id;
	}
	
	public Object getName() {
		return name;
	}
}
