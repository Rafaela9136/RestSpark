package general;

import controller.DeviceUserController;
import services.DeviceUserService;

public class Main {
	public static void main(String[] args) {
		new DeviceUserController(new DeviceUserService());
	}
}