package Chap02;

//�Ǽ��� ������ �����ؼ� ǥ��
import java.util.Random;

class RandomDouble {
	public static void main(String[] args) {
		Random rand = new Random();
		double x1 = rand.nextDouble(); // 0.0�̻� 1.0�̸��� ����
		double x2 = -1 - rand.nextDouble() * 10; // 0.0�̻� 10.0�̸��� ����
		double x3 = -1 + 2 * rand.nextDouble(); // -1.0�̻� 1.0�̸��� ����
		System.out.println("3���� ������ �����߽��ϴ�.");
		System.out.println(" 0.0�̻�   1.0�̸���" + x1);
		System.out.println(" 0.0�̻� 10.0�̸���" + x2);
		System.out.println("-1.0�̻�   1.0�̸���" + x3);
	}
}
