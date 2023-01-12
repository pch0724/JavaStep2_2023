package chapter09;

public class DmbCellPhoneMain {

	public static void main(String[] args) {
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone("Java폰", "검정", 10);
		
		//CellPhone으로부터 상속받은 필드
		System.out.println("모델 : " + dmbCellPhone.model);
		System.out.println("색상 : " + dmbCellPhone.color);
		
		//DmbCellPhone의 핃드
		System.out.println("채널 : " + dmbCellPhone.channel);
		
		//CellPhone으로 통화
		System.out.println();
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.hangUp();
		dmbCellPhone.sendVoice("안녕하세요");
		dmbCellPhone.receiveVoice("반갑습니다.");
		dmbCellPhone.powerOff();
		System.out.println();
		
		
		//DmbCellPhone의 메서드를 사용하여 채널 바꾸기
		dmbCellPhone.powerOn();
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannel(15);
		dmbCellPhone.turnOffDmb();
		dmbCellPhone.powerOff();
		
	}

}
