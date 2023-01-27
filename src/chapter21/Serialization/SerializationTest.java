package chapter21.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{

	private static final long serialVersionUID = 1L; //직렬화를 거친다 | 파일 또는 네트워크를 통해 주고 받을때 시리얼 버전이 일치해야 주고 받을 수 있음

	String name;
	String job;
	//transient String number; 
	// transient : 직렬화(Binary(Byte)화 하지 않겠다) 없이 있는 그대로 사용하겠다는 의미
	
	public Person() {
		
	}
	
	public Person(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}

	@Override
	public String toString() {
		return name + ", " + job;
	}
	
}

public class SerializationTest {

	public static void main(String[] args) {

		Person personHong = new Person("홍길동", "대표이사");
		Person personKim = new Person("김유신", "상무이사");
		/*
		ObjectOutputStream : 파일이나 네트워크로 데이터를 전달하기 위해 '직렬화' 수행해줌
		writeObject() : 직렬화 함수
		*/
	
		try (FileOutputStream fos = new FileOutputStream("serial.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			//직렬화 과정
			oos.writeObject(personHong);
			oos.writeObject(personKim);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//=========================역직렬화===================================
		/*
		ObjectInputStream : 파일이나 네트워크를 통해 전달 받은 직렬화된 데이터를 '다시 원래대로 돌리는'(역직렬화) 역할
		readObject() : 역직렬화 함수
		직렬화 하기 전 객체로 캐스팅해줘야함
		*/
		
		try (FileInputStream fis = new FileInputStream("serial.out");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			
			//역직렬화 과정
			Person p1 = (Person)ois.readObject();
			Person p2 = (Person)ois.readObject();
			System.out.println(p1);
			System.out.println(p2);
			
			//System.out.println(ois.readObject());
			//System.out.println(ois.readObject());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}//m

}//c
