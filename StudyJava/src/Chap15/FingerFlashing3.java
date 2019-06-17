package Chap15;

//3�� ����������
import java.util.Scanner;

class FingerFlashing3 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		HumanPlayer hp = new HumanPlayer();
		ComputerPlayer cp1 = new ComputerPlayer();
		ComputerPlayer cp2 = new ComputerPlayer();
		String[] hands = { "����", "����", "��" };
		int retry; // �ٽ� �� ��?
		do {
			// ��ǻ���� �� ����
			int comp1 = cp1.nextHand();
			int comp2 = cp2.nextHand();
			// ����� �� ����(�б�)
			int user = hp.nextHand();
			// ������ �� ǥ��
			System.out.println("��ǻ��1�� " + hands[comp1] + "�̰�, " + "��ǻ��2�� " + hands[comp2] + "�̸�, " + "����� "
					+ hands[user] + "�Դϴ�.");
			// ����
			int r1 = (user - comp1 + 3) % 3; // user �� comp1
			int r2 = (user - comp2 + 3) % 3; // user �� comp2
			if (r1 == 2 && r2 == 2) // user�� �¸�
				System.out.println("����� �̰���ϴ�.");
			else if (r1 == 1 && r2 == 0) // comp1�� �¸�
				System.out.println("��ǻ��1�� �̰���ϴ�.");
			else if (r1 == 0 && r2 == 1) // comp2�� �¸�
				System.out.println("��ǻ��2�� �̰���ϴ�.");
			else if (r1 == 0 && r2 == 2) // user�� comp1�� �¸�
				System.out.println("��Ű� ��ǻ��1�� �̰���ϴ�.");
			else if (r1 == 2 && r2 == 0) // user�� comp2�� �¸�
				System.out.println("��Ű� ��ǻ��2�� �̰���ϴ�.");
			else if (r1 == 1 && r2 == 1) // comp1�� comp2�� �¸�
				System.out.println("��ǻ��1�� 2�� �¸��Դϴ�.");
			else // ���
				System.out.println("�����ϴ�.");
			// �ٽ� �� �� ���� Ȯ��
			do {
				System.out.print("�ٽ� �� ��? (0)�ƴϿ� (1)�ף�");
				retry = stdIn.nextInt();
			} while (retry != 0 && retry != 1);
		} while (retry == 1);
	}
}
