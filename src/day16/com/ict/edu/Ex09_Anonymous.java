package day16.com.ict.edu;

interface Animal {
	public void sound();
	public String play();
}

class Dog implements Animal {
	@Override
	public void sound() {
		System.out.println("멍~멍~");

	}
	@Override
	public String play() {
		return "꼬리잡기";
	}

}

class Cat {
	void play(Animal animal) {
		animal.sound();
	}
}

public class Ex09_Anonymous {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		System.out.println(dog.play());
		
		Cat cat =new Cat();
		cat.play(new Animal() {
			@Override
			public void sound() {
				System.out.println("야옹~~");
			}
			
			@Override
			public String play() {
				return "그루밍하기";
			}
		});
	}
}
