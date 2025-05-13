package entity;

public class Phone<K,V> extends MyMap<Object, String>{

	public Phone(Object id, String name) {
		super(id, name);
	}

	public Object getKey() {
		return id;
	}

	public Object getPhoneNumber() {
		return name;
	}
	
}
