package eksempelpersist;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PersistAndLoadPerson {

	public static void main(String[] args) {
		Person person = null;

		try (FileInputStream f_in = new FileInputStream("person.ser")) {
			try (ObjectInputStream obj_in = new ObjectInputStream(f_in)) {
				Object obj = obj_in.readObject();
				if (obj instanceof Person) {
					person = (Person) obj;
					System.out.println(person);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		person.addGrade(4);
		person.addGrade(0);

		try (FileOutputStream f_out = new FileOutputStream("person.ser")) {
			try (ObjectOutputStream obj_out = new ObjectOutputStream(f_out)) {
				obj_out.writeObject(person);
				System.out.println("Person er gemt: " + person);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
