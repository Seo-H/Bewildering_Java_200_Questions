package Chap02;

//Ű���忡�� �Է��� ������ ǥ��
//���α׷��� ���� �κ�(Ŭ���� ���� ����)�� �ۼ��Ѵ�.
import java.util.Scanner;

class ScanInteger {
	public static void main(String[] args) {
        // main �޼����� ���� �κ�(���� �Է¹޴� �� ������)�� �ۼ��Ѵ�
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��������");
        // Ű���带 ���� �Է��� �������� �޴´�
		int x = stdIn.nextInt(); // �Է¹��� �������� x�� �����Ѵ�
		System.out.println(x + "�� �Է��߽��ϴ�.");
	}
}
