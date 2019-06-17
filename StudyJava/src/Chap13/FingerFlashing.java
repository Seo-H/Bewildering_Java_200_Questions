package Chap13;

//���������� �׽�Ʈ ���α׷�
import java.util.Scanner;

class FingerFlashing {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		HumanPlayer hp = new HumanPlayer();
		ComputerPlayer cp = new ComputerPlayer();
		String[] hands = { "����", "����", "��" };
		int retry; // �ٽ� �ѹ�?
		do {
			// ��ǻ���� ���� ����
			int comp = cp.nextHand();
			// ����� �� ����(�б�)
			int user = hp.nextHand();
			// ������ ���� ǥ��
			System.out.println("���� " + hands[comp] + "�̰�, ����� " + hands[user] + "�Դϴ�.");
			// ����
			int judge = (user - comp + 3) % 3;
			switch (judge) {
			case 0:
				System.out.println("�����ϴ�. ");
				break;
			case 1:
				System.out.println("����� �����ϴ�. ");
				break;
			case 2:
				System.out.println("����� �̰���ϴ�. ");
				break;
			}
			// �ٽ� �ѹ� ���� Ȯ��
			do {
				System.out.print("�ٽ� �ѹ�? (0) �ƴϿ� (1) �ף�");
				retry = stdIn.nextInt();
			} while (retry != 0 && retry != 1);
		} while (retry == 1);
	}
}