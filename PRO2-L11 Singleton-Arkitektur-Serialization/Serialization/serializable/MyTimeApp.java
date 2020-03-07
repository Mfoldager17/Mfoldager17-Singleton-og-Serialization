package serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MyTimeApp {

	public static void main(String[] args) {

		MyTime m = new MyTime();

		System.out.println("Start time: " + m.getTime());
		System.out.println();

		for (int i = 0; i < 10; i++) {
			m.increase();
		}

		System.out.println("Time after 10 increase: " + m.getTime());

		try {
			FileOutputStream fileOut = new FileOutputStream("src/serializable/myTime.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(m);
			System.out.println("MyTime er gemt: " + m);
			out.close();
			fileOut.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
