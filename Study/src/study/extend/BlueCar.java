package study.extend;

public class BlueCar extends Car{
	public void drive() {
		System.out.println(this.getClass().getName() + " is driving");
	}

	public void drive(String name) {
		System.out.println(name + " is driving");
	}
}
