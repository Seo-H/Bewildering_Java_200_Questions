package Chap05;

//float�� ������ double�� ������ �Ǽ����� �о ǥ��
import java.util.Scanner;

class FloatDoubleScanPrint {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("���� x�� float���Դϴ�. ���� y�� double���Դϴ�.");
		System.out.print("x : ");
		float x = stdIn.nextFloat();
		System.out.print("y : ");
		double y = stdIn.nextDouble();
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
