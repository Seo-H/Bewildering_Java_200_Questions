package Chap13_1;

//--- ���� Ŭ���� (Ver.2) ---//
abstract class Animal {
	private String name; // �̸�

	public Animal(String name) {
		this.name = name;
	} // ������

	public abstract void bark(); // ¢��

	public String getName() {
		return name;
	} // �̸� Ȯ��

	public abstract String toString(); // ���ڿ� ǥ�� ��ȯ 1

	public void introduce() {
		System.out.print(toString() + "�̴�.");
		bark();
	}
}
