package eksempelpersist;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PersistPerson {

	public static void main(String[] args) {
		Person p = new Person("Jane Jensen");
		p.addGrade(12);
		p.addGrade(10);
		p.addGrade(7);
		try {
			FileOutputStream f_out = new FileOutputStream("person.ser");
			ObjectOutputStream obj_out = new ObjectOutputStream(f_out);
			obj_out.writeObject(p);
			System.out.println("Person er gemt:" + p);
			obj_out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
