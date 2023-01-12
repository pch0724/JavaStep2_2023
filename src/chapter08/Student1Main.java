package chapter08;

public class Student1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 stdLee =new Student1();
		stdLee.setStudentName("이재민");
		System.out.println(stdLee.StudentName);
		System.out.println(stdLee.getSerialNum());
		System.out.println(Student1.getSerialNum());
		Student1.serialNum++; // 후위연산 * static 변수는 앵간하면 class로 호출하자
		
		System.out.println();
		Student1 stdKim = new Student1();
		stdKim.setStudentName("김창우");
		System.out.println(stdKim.StudentName);
		System.out.println(stdKim.getSerialNum());
		Student1.serialNum++; // 후위연산
		
		System.out.println();
		Student1 stdPark = new Student1();
		stdKim.setStudentName("박창훈");
		System.out.println(stdKim.StudentName);
		System.out.println(stdKim.getSerialNum());
		Student1.serialNum++; // 후위연산
		
	}

}
