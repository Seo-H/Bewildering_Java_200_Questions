package Chap13;

//--- �� Ŭ���� (Ver.1) ---//
class Dog extends Animal {
	private String type; // ���� ����

	public Dog(String name, String type) { // ������
		super(name);
		this.type = type;
	}

	public void bark() {
		System.out.println("�۸�!");
	} // ¢��
}