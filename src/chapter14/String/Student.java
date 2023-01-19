package chapter14.String;

public class Student {

	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		
		return studentId + ", " + studentName;
	}
	
	//물리적 주소 4561354(임의의 메모리값) => studentId
	@Override
	public int hashCode() {
		
		return studentId;
	}
	//논리적 비교문(내용을 비교)
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {//obj(부모클래스)의 안에 Student(자식클래스)가 포함되는가?
			Student std = (Student)obj;//obj의 다운캐스팅 | Object는 일반 클래스의 상위 클래스 | obj는 Object의 객체이므로 다운캐스팅이 필요함
			if(studentId == std.studentId) {//비교판단
				return true;
			}else {
				return false;
			}
		}
		
		return false;
	}
	
	
	
	
	
}
