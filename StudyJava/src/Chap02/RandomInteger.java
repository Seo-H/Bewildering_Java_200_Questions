package Chap02;

//������ ������ �����ؼ� ǥ��
//���α׷��� ù �κ�(Ŭ���� ���� ����)�� �д�.
import java.util.Random;

class RandomInteger {
	public static void main(String[] args) {
		// main �޼����� ù �κ�(������ �����ϴ� c ����)�� �д�.
		Random rand = new Random();

		// ������ �����Ѵ�.
		int n1 = 1 + rand.nextInt(9); // �� �ڸ� ���� ������ 1 ~ 9��
		int n2 = -1 - rand.nextInt(9); // �� �ڸ� ���� ������-1 ~ -9��
		int n3 = 10 + rand.nextInt(90); // �� �ڸ� ���� ������10 ~ 99��
		System.out.println("3���� ������ �����߽��ϴ�.");
		System.out.println("�� �ڸ� ���� ������" + n1);
		System.out.println("�� �ڸ� ���� ������" + n2);
		System.out.println("�� �ڸ� ���� ������" + n3);
	}
}
