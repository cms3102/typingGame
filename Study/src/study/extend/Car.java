package study.extend;

public class Car {
	/*
	 * 같은 이름의 서로 다른 매개변수(파라미터)를 가진 메소드를 오버로딩이라고 한다.
	 */
	public void drive() {
		System.out.println(this.getClass().getName() + " is driving");
	}

	public void drive(String name) {
		System.out.println(name + " is driving");
	}
}
