package Chap12;

//�������� Ȯ�� ��ȯ�� ��� ��ȯ
class CarTester3 {
	public static void main(String[] args) {
		Car car1 = new ExCar("W221", 1845, 1490, 5205, 90.0, new Day(2015, 12, 24));
		car1.move(10, 10); // �̵� 1
		//System.out.println("�� ���� �Ÿ���" + car1.getTotalMileage()); // ���� 2
		System.out.println("�� ���� �Ÿ���" + ((ExCar) car1).getTotalMileage());
	}
}
