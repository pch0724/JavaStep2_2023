package chapter10;

public class AirPlaneMain {

	public static void main(String[] args) {

		SuperSonicAirPlane ssap = new SuperSonicAirPlane();
		
		ssap.takeoff();
		ssap.fly();
		ssap.flyMode=SuperSonicAirPlane.SuperSonic;
		ssap.fly();
		ssap.flyMode=SuperSonicAirPlane.Normal;
		ssap.landing();
		
	}

}
