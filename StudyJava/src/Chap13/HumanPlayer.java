package Chap13;

//���������� ��� �÷��̾� Ŭ����
import java.util.Scanner;

public class HumanPlayer extends Player {
	private static Scanner stdIn;
	static {
		stdIn = new Scanner(System.in);
	}

//--- �� ����(Ű���带 ���� �Է�) ---//
	public int nextHand() {
		do {
			System.out.print("����������!!!0��������1��������2����:");
			hand = stdIn.nextInt();
		} while (hand < 0 || hand > 2);
		return hand;
	}
}