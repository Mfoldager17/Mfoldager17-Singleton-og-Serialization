package setup;

import application.controller.Controller;

public class StorageSetup {

	public static void main(String[] args) {
		Controller c = Controller.getController();

		c.init();
	}

}
