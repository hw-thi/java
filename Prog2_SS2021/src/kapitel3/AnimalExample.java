package kapitel3;

abstract class Animal {
	private String name;
	private int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	// abstrakte Methoden
	abstract public void makeSound();
	abstract public int humanAge();
}

class Dog extends Animal {
	private String breed;
	
	public Dog(String name, int age, String breed) {
		super(name, age);
		this.breed = breed;
	}

	@Override
	public void makeSound() {
		System.out.println("woof!");
	}

	@Override
	public int humanAge() {
        int result = 0;
        
        if (getAge() == 1) {
            result = 14;
        } else if (getAge() == 2) {
            result = 22;
        } else if (getAge() > 2) {
            result = 22 + (getAge() - 2) * 5;
        }
        return result;
	}
}

class Cat extends Animal {
	public Cat(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void makeSound() {
		System.out.println("miao!");
	}

	@Override
	public int humanAge() {
        int result = 0;
        
        if (getAge() == 1) {
            result = 16;
        } else if (getAge() == 2) {
            result = 24;
        } else if (getAge() > 2) {
            result = 24 + (getAge() - 2) * 4;
        }
        return result;
	}
}

public class AnimalExample {

	public static void main(String[] args) {
		Animal zoe = new Dog("Zoe", 2, "Mischling");
		Animal paul = new Cat("Paul", 5);
		zoe.makeSound();
		paul.makeSound();
		System.out.printf("Zoe ist %d Menschenjahre alt, Paul %d.%n", zoe.humanAge(), paul.humanAge());
	}

}
