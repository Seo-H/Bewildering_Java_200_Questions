package Chap16;

//Exception ���ܿ� RuntimeException ���ܸ� ������ ĳġ�ϱ�
import java.util.Scanner;

class ThrowAndCatch {
	// --- sw���� ���� ���� �߻� ---//
	static void check(int sw) throws Exception {
		switch (sw) {
		case 1:
			throw new Exception("�˻� ���� �߻�!!");
		case 2:
			throw new RuntimeException("��˻� ���� �߻�!!");
		}
	}

	// --- check�� ȣ�� ---//
	static void test(int sw) throws Exception {
		check(sw); // �� ȣ���� �˻� ���� Exception�� �߻��� ���ɼ��� �ִ�.
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("sw��");
		int sw = stdIn.nextInt();
		try {
			test(sw);
		} catch (RuntimeException e) { // e: ���� RuntimeException�� �� ���� Ŭ������ �����Ѵ�.
			System.out.println(e.getMessage());
		} catch (Exception e) { // e: ���� Exception�� �� ���� Ŭ������ �����Ѵ�.
			System.out.println(e.getMessage());
		}
	}
}