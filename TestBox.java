public class TestBox {
	static Integer i;
	static int j;
	
	public static void main (String[] args) {
		TestBox.go();
	}
	public static void go() {
		j = i;
		System.out.println(j);
		System.out.println(i);
	}
}