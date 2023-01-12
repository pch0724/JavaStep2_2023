package chapter10;

public class SuperSonicAirPlane extends AirPlane{

	//NORMAL = 1
	//SUPERSONIC = 2
	public static final int Normal = 1; 
	public static final int SuperSonic = 2;
	public int flyMode = Normal;
	@Override
	public void fly() {
		if(flyMode == Normal) {
			super.fly();			
		}else if(flyMode == SuperSonic) {
			System.out.println("초음속 비행입니다.");
		}
	}
	
	
	
}
