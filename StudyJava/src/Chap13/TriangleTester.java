package Chap13;

//���� �̵ �ﰢ�� Ŭ�������� �׽�Ʈ ���α׷�
import java.util.Scanner;

class TriangleTester {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("�ﰢ���� ������");
		int no = stdIn.nextInt(); // ������ ������ �Է�
		AbstTriangle[] p = new AbstTriangle[no];
		for (int i = 0; i < no; i++) {
			int type;
			do {
				System.out.print((i + 1) + "���� �ﰢ�� ������1������ ������2���»� ����" + "�� 3 ������ ������4����� ��������");
				type = stdIn.nextInt();
			} while (type < 1 || type > 4);
			System.out.print("���̣�");
			int len = stdIn.nextInt();
			p[i] = (type == 1) ? new TriangleLB(len)
					: (type == 2) ? new TriangleLU(len) : (type == 3) ? new TriangleRB(len) : new TriangleRU(len);
		}
		for (AbstTriangle s : p) {
			s.print();
			System.out.println();
		}
	}
}
