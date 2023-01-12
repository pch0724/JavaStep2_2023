package chapter09;

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

	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		
		//Animal animal = new Human();
		//aTest.moveAnimal(Animal animal); Animal animal이 매개변수의 기본형
		aTest.moveAnimal(new Human()); // = new Human().move(); 한 것과 같음??
		aTest.moveAnimal(new Tiger()); 
		aTest.moveAnimal(new Eagle());

		
		
	}//m

	public void moveAnimal(Animal animal) { // Animal 클래스에 animal이라는 객체가 매개변수로 활용됨
		animal.move();
	}//MA
}//c
