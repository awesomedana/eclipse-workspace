package step5;

public class Person {
	private String name;
	int count;
	static int sCount;
	
	public Person(String name) {
		this.name = name;
		count++;
		sCount++;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
