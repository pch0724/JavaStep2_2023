package chapter11;

public class AnimalMain {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		System.out.println("---------------------");
		/*
		//변수의 자동 형(타입) 변환
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		System.out.println();
		animal = new Cat();		
		animal.sound();
		*/
		
		animalSound(new Cat());
		animalSound(new Dog());
	}//m

	public static void animalSound(Animal animal) {
		animal.sound();
	}
	
}//c
