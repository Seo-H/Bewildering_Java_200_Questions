package Chap11;

//����, ������, ���� ���� ���ϱ�
import java.util.Scanner;
import static java.lang.Math.*;
import static java.lang.System.in;
import static java.lang.System.out;

class MathMethods {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(in);
		out.print("�� ����");
		double x = stdIn.nextDouble();
		out.println("���񰪣�" + abs(x));
		out.println("�����٣�" + sqrt(x));
		out.println("��  �̣�" + PI * x * x);
	}
}
