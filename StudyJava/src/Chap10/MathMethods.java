package Chap10;

//����, �������� ���� ���� ������ ���ϱ�
import java.util.Scanner;

class MathMethods {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("�Ǽ�����");
		double x = stdIn.nextDouble();
		System.out.println("���񰪣�" + Math.abs(x));
		System.out.println("�����٣�" + Math.sqrt(x));
		System.out.println("��  ����" + Math.PI * x * x);
	}
}
