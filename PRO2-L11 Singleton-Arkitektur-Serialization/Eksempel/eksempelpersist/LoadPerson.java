package eksempelpersist;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LoadPerson {

	public static void main(String[] args) {
		try {
			FileInputStream f_in = new FileInputStream("person.ser");
			ObjectInputStream obj_in = new ObjectInputStream(f_in);
			Object obj = obj_in.readObject();
			if (obj instanceof Person) {
				Person p = (Person) obj;
				System.out.println(p);
			}
			obj_in.close();
			f_in.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
