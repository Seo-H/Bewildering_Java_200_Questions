package Chap13_1;

//--- ����� Ŭ���� (Ver.2) ---//
class Cat extends Animal {
	private int age; // ����

	public Cat(String name, int age) { // ������
		super(name);
		this.age = age;
	}

	public void bark() {
		System.out.println("�Ŀ�!");
	} // ¢��

	public String toString() { // ���ڿ� ǥ�� ��ȯ 3
		return age + "�� " + getName();
	}
}