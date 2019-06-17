package Chap12;

//�ڵ��� Ŭ����(�� ���� �Ÿ� �߰�)
class ExCar extends Car {
	private double totalMileage; // �� ���� �Ÿ�

	// --- ������ ---//
	public ExCar(String name, int width, int height, int length, double fuel, Day purchaseDay) {
		super(name, width, height, length, fuel, purchaseDay);
		totalMileage = 0.0;
	}

	// --- �� ���� �Ÿ� Ȯ�� ---//
	public double getTotalMileage() {
		return totalMileage;
	}

	// --- ��� ǥ�� ---//
	public void putSpec() {
		super.putSpec();
		System.out.printf("�� ���� �Ÿ���%.2fkm\n", totalMileage);
	}

	// --- �ع������� dx, �ٹ������� dy�̵� ---//
	public boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx * dx + dy * dy); // �̵� �Ÿ�
		if (!super.move(dx, dy))
			return false; // �̵��� �� ���� ������ ����
		else {
			totalMileage += dist; // �� ���� �Ÿ�
			return true; // �̵� �Ϸ�
		}
	}
}
