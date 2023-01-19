package chapter14.hashcode;

public class Key {

	public int number;
	public int name;
	public int addr;
	
	
	public Key(int number) {
		this.number = number;
	}

	//논리적 주소(눈으로 보이는 값)
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Key) {
			Key compareKey = (Key)obj; //Key와 obj를 비교하기 위해서는 obj가 최상위 객체이므로 obj의 key단계로의 다운캐스팅이 필요함 
			if(this.number == compareKey.number) {//this.number : Key 클래스의 필드 / compareKey.number : Key 클래스의 필드
				return true;//값 일치
			}//else 갈필요가 없는게 어차피 값이 다르면 바로 false 리턴 때리면 되니까
		}
		return false;
	}
	
	//물리적 주소(메모리 값)
	@Override
	public int hashCode() {
		
		//return super.hashCode();//원래의 heap 메모리 16진수 주소를 반환함
		return number;//원래의 heap 메모리 16진수 주소를 반환함
	}
	
	
	
	
}
