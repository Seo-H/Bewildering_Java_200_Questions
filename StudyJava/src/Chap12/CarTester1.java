package Chap12;

//is-A ����� �ν��Ͻ� ����
class CarTester1 {
	public static void main(String[] args) {
		Car car1 = new Car("W140", 1885, 1490, 5220, 95.0, new Day(2018, 10, 13));
		ExCar car2 = new ExCar("W221", 1845, 1490, 5205, 90.0, new Day(2015, 12, 24));
		Car x; // Ŭ������ ������ ��
		x = car1; // �ڱ��ڽ��� �� �ν��Ͻ��� ������ �� �ִ�(�翬) 1
		x = car2; // ���� Ŭ�������� �ν��Ͻ��� ������ �� �ִ�! 2
		System.out.println("x�����ϣ�" + x.getPurchaseDay());
		ExCar y; // Ŭ������ ������ ��

		// y = car1; // ���� Ŭ�������� �ν��Ͻ��� ������ �� ����! 3
		y = car2; // �ڱ��ڽ��� �� �ν��Ͻ��� ������ �� �ִ�(�翬) 4
		System.out.println("y�����ϣ�" + y.getPurchaseDay());
		System.out.println("y�� �� ���� �Ÿ���" + y.getTotalMileage());
	}
}
