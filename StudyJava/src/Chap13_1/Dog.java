package Chap13_1;

//--- �� Ŭ���� (Ver.2) ---//
class Dog extends Animal {
	private String type; // ���� ����

	public Dog(String name, String type) { // ������
		super(name);
		this.type = type;
	}

	public void bark() {
		System.out.println("�۸�!");
	} // ¢��

	public String toString() { // ���ڿ� ǥ�� ��ȯ 2
		return type + "�� " + getName();
	}
}