package Chap16;

//�� �������� �о ������ ������ ���(�޼���ȭ + ���� ó��)
import java.util.Scanner;
import java.util.InputMismatchException;

class MulDiv2 {
	static int mul(int x, int y) {
		return x * y;
	}

	static int div(int x, int y) {
		return x / y;
	}

	static void muldiv(int x, int y) {
		System.out.println("x * y = " + mul(x, y)); // x * y�� ǥ��(��)
		System.out.println("x / y = " + div(x, y)); // x / y�� ǥ��(��
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		try {
			System.out.print("x����");
			int x = stdIn.nextInt();
			System.out.print("y����");
			int y = stdIn.nextInt();
			muldiv(x, y);
		} catch (InputMismatchException e) {
			System.out.println("�Է� ���� �߻�." + e);
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("��� ���� �߻�." + e);
			e.printStackTrace();
		} finally {
			System.out.println("���α׷��� �����մϴ�.");
		}
	}
}
