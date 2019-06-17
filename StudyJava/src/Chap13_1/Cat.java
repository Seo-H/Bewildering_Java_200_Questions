package Chap13_1;

//--- 고양이 클래스 (Ver.2) ---//
class Cat extends Animal {
	private int age; // 나이

	public Cat(String name, int age) { // 생성자
		super(name);
		this.age = age;
	}

	public void bark() {
		System.out.println("냐옹!");
	} // 짖기

	public String toString() { // 문자열 표현 반환 3
		return age + "의 " + getName();
	}
}