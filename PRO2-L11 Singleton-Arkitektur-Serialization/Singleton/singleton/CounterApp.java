package singleton;

public class CounterApp {

	public static void main(String[] args) {
		Counter c = Counter.getInstance();
		Counter c1 = Counter.getInstance();

		System.out.println(c1.getValue());
		System.out.println(c.getValue());
		c.count();
		System.out.println(c1.getValue());
		System.out.println(c.getValue());
		c1.count();
		System.out.println(c1.getValue());
		System.out.println(c.getValue());
		c1.times2();
		System.out.println(c1.getValue());
		System.out.println(c.getValue());
		c.zero();
		System.out.println(c1.getValue());
		System.out.println(c.getValue());

	}

}
