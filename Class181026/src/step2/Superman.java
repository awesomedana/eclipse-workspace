package step2;

public class Superman implements Flyer, Fighter {
	@Override
	public void fight() {
		System.out.println("슈퍼맨이 싸우다");
	}
	@Override
	public void fly() {
		System.out.println("슈퍼맨이 악당과 날다");
	}
}
