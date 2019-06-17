package Chap08;

class Car {
	private String name; // �̸�
	private String number; // ��ȣ
	private int width; // ��
	private int height; // ����
	private int length; // ����
	private double x; // ���� ��ġ�� X ��ǥ
	private double y; // ���� ��ġ�� Y ��ǥ
	private double tankage; // ��ũ �뷮
	private double fuel; // ���� ����
	private double sfc; // ����

	// --- ������ ---//
	Car(String name, String number, int width, int height, int length, double tankage, double fuel, double sfc) {
		this.name = name;
		this.number = number;
		this.width = width;
		this.height = height;
		this.length = length;
		this.tankage = tankage;

		// ���� ������ �ִ밪�� ��ũ �뷮�� ����
		this.fuel = (fuel <= tankage) ? fuel : tankage;
		this.sfc = sfc;
		x = y = 0.0;
	}

	double getX() {
		return x;
	} // ���� ��ġ�� X��ǥ �ҷ�����

	double getY() {
		return y;
	} // ���� ��ġ�� Y��ǥ �ҷ�����

	double getFuel() {
		return fuel;
	} // ���� ���� �ҷ�����

	// --- ��� ǥ�� ---//
	void putSpec() {
		System.out.println("�̸���" + name);
		System.out.println("��ȣ��" + number);
		System.out.println("������" + width + "mm");
		System.out.println("����" + height + "mm");
		System.out.println("���壺" + length + "mm");
		System.out.println("��ũ��" + tankage + "����");
		System.out.println("����" + sfc + "km/����");
	}

	// --- �ع������� dx, �ٹ������� dy�̵� ---//
	boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx * dx + dy * dy); // �̵� �Ÿ�
		double f = dist / sfc; // �̵��� �ʿ��� ����
		if (f > fuel)
			return false; // �̵��� �� ���� �� ���� ����
		else {
			fuel -= f; // �̵� �Ÿ��и�ŭ ���ᰡ �ش�
			x += dx;
			y += dy;
			return true; // �̵� �Ϸ�
		}
	}

	// --- df ���� ���� ---//
	void refuel(double df) {
		if (df > 0) {
			fuel += df;
			if (fuel > tankage)
				fuel = tankage;
		}
	}
}