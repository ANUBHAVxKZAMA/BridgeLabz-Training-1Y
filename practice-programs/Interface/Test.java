package Interface;
public class Test {
	public static void main(String[] args) {
		Calculator c = (a, b) -> a + b; // lambda use
		System.out.println(c.add(5, 3));
		}
}