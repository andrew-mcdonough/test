package test;

public class User {
	
	Integer age = null;

	public void setAge(Integer string) {
		age = string;
		throw new IllegalArgumentException();
	}

}
