package Chap12;

//�ڵ��� Ŭ����(�� ���� �Ÿ�) ��� ��(���� ��ġ, ���� �ܷ�, ������ ǥ��)
class ExCarTester1 {
	public static void main(String[] args) {
		ExCar myCar = new ExCar("W221", 1845, 1490, 5205, 90.0, new Day(2015, 12, 24));
		System.out.printf("������ġ�� (%.2f,%.2f)\n", myCar.getX(), myCar.getY());
		System.out.printf("�������᣺%.2f����\n", myCar.getFuel());
		System.out.printf("�� �� �ϣ�%s\n", myCar.getPurchaseDay());
	}
}
