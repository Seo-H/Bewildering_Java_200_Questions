package Chap07;

//���� �� �Ǽ��� ������ ���ϴ� �޼���(���� ����)
import java.util.Scanner;

class Absolute {
//--- x�� ������ ��ȯ ---//
	static int absolute(int x) {
		return x >= 0 ? x : -x;
	}

//--- x�� ���� ��ȯ---//
	static long absolute(long x) {
		return x >= 0 ? x : -x;
	}

//--- x�� ���� ��ȯ---//
	static float absolute(float x) {
		return x >= 0 ? x : -x;
	}

//--- x�� ���� ��ȯ---//
	static double absolute(double x) {
		return x >= 0 ? x : -x;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("int   �� ���� a�� ����");
		int a = stdIn.nextInt();
		System.out.print("long  �� ���� b�� ����");
		long b = stdIn.nextLong();
		System.out.print("float �� �Ǽ� c�� ����");
		float c = stdIn.nextFloat();
		System.out.print("double�� �Ǽ� d�� ����");
		double d = stdIn.nextDouble();
		System.out.println("a�� ������ " + absolute(a) + "�Դϴ�.");
		System.out.println("b�� ������ " + absolute(b) + "�Դϴ�.");
		System.out.println("c�� ������ " + absolute(c) + "�Դϴ�.");
		System.out.println("d�� ������ " + absolute(d) + "�Դϴ�.");
	}
}