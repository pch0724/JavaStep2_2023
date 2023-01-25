package chapter18.HashMap;

public class Student {

	public int sNum;
	public String name;
	
	public Student(int sNum, String name) {
		this.sNum = sNum;
		this.name = name;
	}//olc

	@Override
	public int hashCode() {
		
		return sNum + name.hashCode();
	}//has

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Student) {
			Student student = (Student)obj;
			return (sNum == student.sNum) && (name.equals(student.name));
		}else {
			return false;			
		}
	}//eq

	@Override
	public String toString() {
		return "학번 : " + sNum + "번 이름 : " + name + "님의 점수";
	}//tos
		
}//stud
