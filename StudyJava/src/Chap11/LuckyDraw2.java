package Chap11;

//���� ��¥�� �(���2)
import java.util.GregorianCalendar;
import java.util.Random;
import static java.util.GregorianCalendar.*;

class LuckyDraw2 {
	public static void main(String[] args) {
		GregorianCalendar today = new GregorianCalendar();
		int y = today.get(YEAR); // �� 2
		int m = today.get(MONTH) + 1; // ��
		int d = today.get(DATE); // ��
		System.out.printf("������ %04d�� %02d�� %02d���Դϴ�.\n", y, m, d);
		Random rand = new Random();
		int k = rand.nextInt(10); // ���0~9�� ����
		System.out.print("������ ��� ");
		switch (k) {
		case 0:
			System.out.print("���");
			break;
		case 1:
		case 2:
		case 3:
			System.out.print("��");
			break;
		case 4:
		case 5:
		case 6:
			System.out.print("�߱�");
			break;
		case 7:
		case 8:
			System.out.print("�ұ�");
			break;
		case 9:
			System.out.print("��");
			break;
		}
		System.out.println("�Դϴ�.");
	}
}