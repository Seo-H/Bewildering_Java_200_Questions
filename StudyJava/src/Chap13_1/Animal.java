package Chap13_1;

//--- 동물 클래스 (Ver.2) ---//
abstract class Animal {
	private String name; // 이름

	public Animal(String name) {
		this.name = name;
	} // 생성자

	public abstract void bark(); // 짖기

	public String getName() {
		return name;
	} // 이름 확인

	public abstract String toString(); // 문자열 표현 반환 1

	public void introduce() {
		System.out.print(toString() + "이다.");
		bark();
	}
}
