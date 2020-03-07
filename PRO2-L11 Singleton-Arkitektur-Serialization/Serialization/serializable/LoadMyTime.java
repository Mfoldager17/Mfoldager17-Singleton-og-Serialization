package serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LoadMyTime {

	public static void main(String[] args) {
		try {
			FileInputStream fileIn = new FileInputStream("src/serializable/myTime.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			Object obj = in.readObject();
			if (obj instanceof MyTime) {
				MyTime m = (MyTime) obj;
				System.out.println(m);
			}
			in.close();
			fileIn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
