package Chap10;

//��� Ŭ���� (Ver.4)
class Human {
	private static int counter = 0; // �� ������ �ĺ� ��ȣ�� �ο��ߴ°�
	private String name; // �̸�
	private int height; // ����
	private int weight; // ü��
	private int id; // �ĺ� ��ȣ

	// --- ������ ---//
	public Human(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		id = ++counter;
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

	public void gainWeight(int w) {
		weight += w;
	} // ���� ���

	public void reduceWeight(int w) {
		weight -= w;
	} // ���� ������

	public int getId() {
		return id;
	} // �ĺ� ��ȣ ��������

	// --- ������ ǥ�� ---//
	public void putData() {
		System.out.println("�̸���" + name);
		System.out.println("���壺" + height + "cm");
		System.out.println("ü�ߣ�" + weight + "kg");
	}
}