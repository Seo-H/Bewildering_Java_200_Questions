package Chap03;

//������ ������ ���� ���������� �� �ϳ��� ǥ��
import java.util.Random;

public class FingerFlashing {
	public static void main(String[] args) {
		Random rand = new Random();
		System.out.print("��ǻ�Ͱ� �� �ͣ�");
		int hand = rand.nextInt(3); // 0~2 ������ ����
		switch (hand) {
		case 0:
			System.out.println("����");
			break;
		case 1:
			System.out.println("����");
			break;
		case 2:
			System.out.println("��");
			break;
		}
	}
}