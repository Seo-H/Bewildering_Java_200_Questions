package Chap12;

//�ڵ��� Ŭ����(Ver.2)
public class Car {
	private String name; // �̸�
	private int width; // ��
	private int height; // ����
	private int length; // ����
	private double x; // ���� ��ġ�� X ��ǥ
	private double y; // ���� ��ġ�� Y ��ǥ
	private double fuel; // ���� ����
	private Day purchaseDay; // ������
	
	//---������ ---//
	Car(String name, int width, int height, int length, double fuel, Day purchaseDay) {
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
		this.fuel = fuel;
		x = y = 0.0;
		this.purchaseDay = new Day(purchaseDay);
	}

	public double getX() {
		return x;
	} // ���� ��ġ�� X��ǥ �ҷ�����

	public double getY() {
		return y;
	} // ���� ��ġ�� Y��ǥ �ҷ�����

	public double getFuel() {
		return fuel;
	} // ���� ���� �ҷ�����

	public Day getPurchaseDay() {
		return new Day(purchaseDay);
	}

	//--- ��� ǥ�� ---//
	public void putSpec() {
		System.out.println("�̸���" + name);
		System.out.println("������" + width + "mm");
		System.out.println("����" + height + "mm");
		System.out.println("���壺" + length + "mm");
	}

	//--- �ع������� dx, �ٹ������� dy�̵� ---//
	public boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx * dx + dy * dy); // �̵� �Ÿ�
		if (dist > fuel)
			return false; // �̵��� �� ���� �� ���� ����
		else {
			fuel -= dist; // �̵� �Ÿ��и�ŭ ���ᰡ �ش�
			x += dx;
			y += dy;
			return true; // �̵� �Ϸ�
		}
	}
}