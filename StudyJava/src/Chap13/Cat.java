package Chap13;

//--- ������ Ŭ���� (Ver.1) ---//
class Cat extends Animal {
	private int age; // ����

	public Cat(String name, int age) { // ������
		super(name);
		this.age = age;
	}

	public void bark() {
		System.out.println("�Ŀ�!");
	} // ¢��
}