package Chap07;

//�ϻ� �Ʒ� (3���� 3�ڸ� ������ ����� ���)
import java.util.Random;
import java.util.Scanner;

class MentalArithmetic {
	static Scanner stdIn = new Scanner(System.in);

//--- ������� ���� Ȯ�� ---//
	static boolean confirmRetry() {
		int cont;
		do {
			System.out.print("�ٽ� �� ��? <Yes��1��No��0>��");
			cont = stdIn.nextInt();
		} while (cont != 0 && cont != 1);
		return cont == 1;
	}

	public static void main(String[] args) {
		Random rand = new Random();
		System.out.println("�ϻ� �Ʒ�!!");
		do {
			int x = rand.nextInt(900) + 100; // 3�ڸ� �� 1
			int y = rand.nextInt(900) + 100; // 3�ڸ� ��
			int z = rand.nextInt(900) + 100; // 3�ڸ� ��
			int pattern = rand.nextInt(4); // ���� ��ȣ
			int answer; // ���� 2
			switch (pattern) {
			case 0:
				answer = x + y + z;
				break;
			case 1:
				answer = x + y - z;
				break;
			case 2:
				answer = x - y + z;
				break;
			default:
				answer = x - y - z;
				break;
			}
			while (true) {
				System.out.print(
						x + ((pattern < 2) ? " + " : " - ") + y + ((pattern % 2 == 0) ? " + " : " - ") + z + " = ");
				int k = stdIn.nextInt(); // �Է��� ���� �д´�
				if (k == answer) // �����̸� ����
					break;
				System.out.println("Ʋ�Ƚ��ϴ�!");
			}
		} while (confirmRetry());
	}
}
