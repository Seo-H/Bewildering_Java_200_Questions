package Chap09_1;

//��� Ŭ����(Ver.3)
public class Human {
	private String name; // �̸�
	private int height; // ����
	private int weight; // ü��
	private Day birthday; // ���� 1

	// --- ������ ---//
	public Human(String name, int height, int weight, Day birthday) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.birthday = new Day(birthday);
	}

	public String getName() {
		return name;
	} // �̸� ��������

	public int getHeight() {
		return height;
	} // ���� �ҷ�����

	public int getWeight() {
		return weight;
	} // ü�� �ҷ�����

	public Day getBirthDay() {
		return new Day(birthday);
	} // ���� �ҷ����� 3

	public void gainWeight(int w) {
		weight += w;
	} // ���� ���

	public void reduceWeight(int w) {
		weight -= w;
	} // ���� ������

	// --- ������ ǥ�� ---//
	public void putData() {
		System.out.println("�̸���" + name);
		System.out.println("���壺" + height + "cm");
		System.out.println("ü�ߣ�" + weight + "kg");
	}

	// --- ���ڿ�ȭ ---//
	public String toString() {
		return "{" + name + ": " + height + "cm " + weight + "kg " + birthday + "���}";
	}
}
