package Practice;

class Mammal{
	void eat() {
		System.out.println("Mammal is Eating");
	}
}

class Horse extends Mammal{
	void eat() {
		System.out.println("Horse is Eating");
		super.eat();
	}
}

class Base{
	public static void main(String[] args) {
		Horse H = new Horse();
		H.eat();
		
	}
}