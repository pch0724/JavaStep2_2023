package chapter08;

public class Student1Main2 {

	public static void main(String[] args) {

		Student2 stdLee =new Student2();
		stdLee.setStudentName("이재민");
		System.out.println("이름 : " + stdLee.StudentName + "아이디 : " + stdLee.studentID);
	
		Student2 stdKim =new Student2();
		stdKim.setStudentName("김창우");
		stdKim.studentID = stdKim.serialNum;
		System.out.println("이름 : " + stdKim.StudentName + "아이디 : " + stdKim.studentID);
		
		Student2 stdPark =new Student2();
		stdPark.setStudentName("박창훈");
		stdPark.studentID = stdLee.serialNum;
		System.out.println("이름 : " + stdPark.StudentName + "아이디 : " + stdPark.studentID);
		
	}

}
