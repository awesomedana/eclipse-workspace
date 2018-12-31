package step5;

public class Test5 {
	public static void main(String[] args) {
		Person p1 = new Person("김지훈");
		System.out.println(p1.count);
		System.out.println("sCount : " + p1.sCount);
		Person p2 = new Person("김영우");
		System.out.println(p2.count);
		System.out.println("sCount : " + p2.sCount);
		Person p3 = new Person("김대영");
		System.out.println(p3.count);
		System.out.println("sCount : " + p3.sCount);
		Person p4 = new Person("장보영");
		System.out.println(p4.count);
		System.out.println("sCount : " + p4.sCount);
	}
}
