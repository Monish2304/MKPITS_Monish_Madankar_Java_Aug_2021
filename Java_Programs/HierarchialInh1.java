class Animal {

	void eat() {System.out.println("Eating.......");}
}

class Dog extends Animal {

	void bark() {System.out.println("Barking.....");}
}

class Cat extends Animal {

	void meow() {System.out.println("Meowing......");}
}

class HierarchialInh1 {

	public static void main(String []args) {

		Cat c1=new Cat();

		c1.meow();

		c1.eat();
	}
}