package Chap12;

//is-A ����� �ν��Ͻ� ����(�޼����� �μ��� ����)
class AccountCompare {
	// ��� �� ���� �ܾ��� ������
	static int compBalance(Account a, Account b) {
		long totalBalanceA = a instanceof TimeAccount
				? ((TimeAccount) a).getBalance() + ((TimeAccount) a).getTimeBalance()
				: a.getBalance();
		long totalBalanceB = b instanceof TimeAccount
				? ((TimeAccount) b).getBalance() + ((TimeAccount) b).getTimeBalance()
				: b.getBalance();
		if (totalBalanceA > totalBalanceB) // a�� ������
			return 1;
		else if (totalBalanceA < totalBalanceB) // b�� ������
			return -1;
		return 0; // a�� b�� ����
	}

	public static void main(String[] args) {
		Account gildong = new Account("�浿", "123456", 500);
		TimeAccount chulsua = new TimeAccount("ö��", "654321", 300, 400);
		System.out.println("�浿�̿� ö���� ���� �ܾ� �� ����Դϴ�.");
		switch (compBalance(gildong, chulsua)) {
		case 0:
			System.out.println("���� ���� �ܾ��� �����ϴ�.");
			break;
		case 1:
			System.out.println("�浿���� ���� �ܾ��� �����ϴ�.");
			break;
		case -1:
			System.out.println("ö���� ���� �ܾ��� �����ϴ�.");
			break;
		}
	}
}