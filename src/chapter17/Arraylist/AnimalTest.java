package chapter17.Arraylist;

import java.util.ArrayList;

class Animal {
	
	void move() {
		System.out.println("동물이 움직입니다.");
	}//move
}//c

class Human extends Animal {
	void move() { //override
		System.out.println("사람은 두 발로 걷습니다.");
	}//move
	void readBook() {
		System.out.println("사람은 책을 읽습니다.");
	}//readBook
}//H

class Tiger extends Animal {
	void move() { //override
		System.out.println("호랑이가 네 발로 걷습니다.");
	}//move
	void hunting() {
		System.out.println("호랑이는 사냥을 합니다.");
	}//hunt
}//T

class Eagle extends Animal {
	void move() { //override
		System.out.println("독수리가 하늘을 납니다.");
	}//move
	void flying() {
		System.out.println("독수리는 날개를 펴고 날아 다닙니다.");
	}//fly
}//H

public class AnimalTest {

	ArrayList<Animal> aniList = new ArrayList<Animal>();
	
	public static void main(String[] args) {
	
		AnimalTest at = new AnimalTest();
	
		//addAnimal => 업캐스팅 메서드
		at.addAnimal();
		System.out.println("----------------------");
		//testCasting => 다운캐스팅
		at.testCasting(); 
	}//main

	public void addAnimal() {
		aniList.add(new Human()); // 업캐스팅(Animal 형으로 자동형변환 처리)
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		for(Animal ani : aniList) {
			ani.move();
		}//for
	}//addAnimal
	
	public void testCasting() {
		
		for(int i = 0; i < aniList.size(); i++) {
			Animal ani = aniList.get(i); //부모 ArrayList의 객체를 ani 객체에 저장
		
			if(ani instanceof Human) {
				Human h = (Human)ani;
				h.readBook();
			}else if(ani instanceof Tiger) {
				Tiger h = (Tiger)ani;
				h.hunting();
			}else if(ani instanceof Eagle) {
				Eagle h = (Eagle)ani;
				h.flying();
			}else {
				System.out.println("지원하지 않음");
			}//if
		}//for
	}//testCasting
}//AnimalTest
