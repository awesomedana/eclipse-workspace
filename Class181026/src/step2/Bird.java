package step2;

public class Bird implements Flyer {
	@Override
	public void fly() {
		System.out.println("새가 날다");
	}
	public void sing() {
		System.out.println("새가 노래하다");
	}
}
