package Chap10;

//�ּڰ�, �ִ��� ���ϴ� ��ƿ�� Ŭ������ �׽�Ʈ ���α׷�
import java.util.Scanner;

public class MinMaxTester {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("x����");
		int x = stdIn.nextInt();
		System.out.print("y����");
		int y = stdIn.nextInt();
		System.out.print("z����");
		int z = stdIn.nextInt();
		System.out.print("�迭a�� ��� ����");
		int num = stdIn.nextInt();
		int[] a = new int[num]; // ��� ���� num�� �迭
		for (int i = 0; i < num; i++) {

			System.out.print("a[" + i + "]��");
			a[i] = stdIn.nextInt();
		}
		System.out.printf("x, y�� �ּڰ��� %d�Դϴ�.\n", MinMax.min(x, y));
		System.out.printf("x, y�� �ִ��� %d�Դϴ�.\n", MinMax.max(x, y));
		System.out.printf("x, y, z�� �ּڰ��� %d�Դϴ�.\n", MinMax.min(x, y, z));
		System.out.printf("x, y, z�� �ִ��� %d�Դϴ�.\n", MinMax.max(x, y, z));
		System.out.printf("�迭 a�� �ּڰ��� %d�Դϴ�.\n", MinMax.min(a));
		int xmin[] = MinMax.minIndexArray(a);
		System.out.print("�ε�����{ ");
		for (int i = 0; i < xmin.length; i++)
			System.out.print(xmin[i] + " ");
		System.out.println("}�Դϴ�.");
		System.out.printf("�迭 a�� �ִ��� %d�Դϴ�.\n", MinMax.max(a));
		int xmax[] = MinMax.maxIndexArray(a);
		System.out.print("�ε����� { ");
		for (int i = 0; i < xmax.length; i++)
			System.out.print(xmax[i] + " ");
		System.out.println("}�Դϴ�.");
	}
}