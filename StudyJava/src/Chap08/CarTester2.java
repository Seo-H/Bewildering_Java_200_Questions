package Chap08;

//�ڵ��� Ŭ����(Ver.1) �̿� ��(2: ��ȭ������ �ڵ����� �̵�)
import java.util.Scanner;

class CarTester2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("���� �����͸� �Է��ϼ���.");
		System.out.print("�� ����");
		String name = stdIn.next();
		System.out.print("�� ȣ��");
		String number = stdIn.next();
		System.out.print("�� ����");
		int width = stdIn.nextInt();
		System.out.print("�� ��");
		int height = stdIn.nextInt();
		System.out.print("�� ¡��");
		int length = stdIn.nextInt();
		System.out.print("��ũ�뷮��");
		double tank = stdIn.nextDouble();
		System.out.print("���ᷮ��");
		double fuel = stdIn.nextDouble();
		System.out.print("�� ��");
		double sfc = stdIn.nextDouble();
		Car myCar = new Car(name, number, width, height, length, tank, fuel, sfc);
		while (true) {
			System.out.printf("���� ��ġ��(%.2f, %.2f)\n", myCar.getX(), myCar.getY());
			System.out.printf("���� ���᣺%.2f\n", myCar.getFuel());
			System.out.print("�̵��ϰڽ��ϱ�?[0��No��1��Yes]��");
			if (stdIn.nextInt() == 0)
				break;
			System.out.print("X���������� �̵� �Ÿ���");
			double dx = stdIn.nextDouble();
			System.out.print("Y���������� �̵� �Ÿ���");
			double dy = stdIn.nextDouble();
			if (!myCar.move(dx, dy))
				System.out.println("���� ����!!");
		}
	}
}
