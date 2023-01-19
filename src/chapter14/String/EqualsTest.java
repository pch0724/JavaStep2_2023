package chapter14.String;

public class EqualsTest {

	public static void main(String[] args) {
		//String 클래스는 이미 toString으로 재정의 되어있음
		String str1=new String("test");
		String str2=new String("test");
		
		Student std1 = new Student(100, "이상우");
		Student std2 = std1; // std1의 메모리주소를 std2로 넘겨줌
		Student std3 = new Student(100, "이상우");//새로운 메모리주소값 부여
		
		//동일한 주소의 두 인스턴스 비교(물리적 논리적 값이 동일)
		System.out.println("----동일한 주소의 두 인스턴스 비교----");
		if(std1 == std2) {//외부(물리적)
			System.out.println("std1과 std2의 주소는 같음");
		}else {
			System.out.println("std1과 std2의 주소는 다름");			
		}
		
		if(std1.equals(std2)) {//내부(논리적)
			System.out.println("std1과 std2는 같음");
		}else {
			System.out.println("std1과 std2는 다름");			
		}
		
		//동일한 주소의 두 인스턴스 비교(물리적는 다르지만 논리적 값이 동일)
		System.out.println("----물리적 주소(==)는 다르지만 논리적 값(.equals)이 동일한 두 인스턴스 비교----");
		if(std1 == std3) {//외부(물리적)
			System.out.println("std1과 std3의 주소는 같음");
		}else {
			System.out.println("std1과 std3의 주소는 다름");			
		}//if(물리)
		
		if(std1.equals(std3)) {//내부(논리적)
			System.out.println("std1과 std3는 같음");
		}else {
			System.out.println("std1과 std3는 다름");			
		}//if(논리)
		
		System.out.println("-------------데이터 값 출력------------------");
		System.out.println("std1의 hashCode : " + std1.hashCode()); //studentId가 100으로 지정되었기 때문
		System.out.println("std3의 hashCode : " + std3.hashCode());

		System.out.println("-------------데이터 값은 같으나 hash값이 다르므로 재정의가 필요------------------");
		System.out.println("std1의 실제 주소값 : " + System.identityHashCode(std1));
		System.out.println("std3의 실제 주소값 : " + System.identityHashCode(std3));
		System.out.println();
		
		//HashCode가 재정의 되어 있음
		System.out.println("-------String 클래스의 실제 값 출력------------");
		System.out.println("str1의 hashCode : " + str1.hashCode());
		System.out.println("str2의 hashCode : " + str2.hashCode());
	}

}
