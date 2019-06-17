package Chap13;

//���� Ŭ�������� �׽�Ʈ ���α׷�
import java.util.Scanner;

class ShapeTester {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("������ ������");
		int no = stdIn.nextInt(); // ������ ������ �Է¹޴´�
		Shape[] p = new Shape[no];
		for (int i = 0; i < no; i++) {
			int type;
			do {
				System.out.print((i + 1) + "�� ������ ����(1������2������" + "�� 3����������4���簢������");
				type = stdIn.nextInt();
			} while (type < 1 || type > 4);
			switch (type) {
			case 1:
				p[i] = new Point(); // �� 3
				break;
			case 2: // ���� 4
			case 3:
				System.out.print("���̴£�");
				int len = stdIn.nextInt();
				p[i] = (type == 2) ? new HorzLine(len) : new VertLine(len);
				break;
			case 4:
				System.out.print("�ʺ�:"); // �簢�� 5
				int width = stdIn.nextInt();
				System.out.print("���̣�");
				int height = stdIn.nextInt();
				p[i] = new Rectangle(width, height);
				break;
			}
		}
		for (Shape s : p) {
			s.print();
			System.out.println();
		}
	}
}