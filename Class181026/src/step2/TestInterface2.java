package step2;

public class TestInterface2 {
	public static void main(String[] args) {
		Flyer fa[] = new Flyer[5];
		fa[0] = new Superman();
//		fa[1] = new Eagle();
		fa[2] = new Bird();
		fa[2].fly();
		
		Bird b = new Bird();
		b.sing();
		
		Fighter fg[] = new Fighter[5];
		fg[0] = new Superman();
		fg[1] = new Eagle();
//		fg[2] = new Bird();
		
		Fighter ff[] = {new Superman(), new Eagle()};
		for (int i = 0; i < ff.length; i++) {
			ff[i].fight();
		}
	}
}
