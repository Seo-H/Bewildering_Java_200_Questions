package Chap09;

//���� ���� Ŭ����(Ver.1)
class Account {
	private String name; // ���� ����
	private String no; // ���� ��ȣ
	private long balance; // ���� �ܰ�

	//--- ������ ---//
	Account(String n, String num, long z) {
		name = n; // ���� ����
		no = num; // ���� ��ȣ
		balance = z; // ���� �ܰ�
	}

	//--- ���� ���� Ȯ�� ---//
	String getName() {
		return name;
	}

	//--- ���� ��ȣ Ȯ�� ---//
	String getNo() {
		return no;
	}

	//--- ���� �ܰ� Ȯ�� ---//
	long getBalance() {
		return balance;
	}

	//--- k�� �Ա� ---//
	void deposit(long k) {
		balance += k;
	}

	//--- k�� ��� ---//
	void withdraw(long k) {
		balance -= k;
	}
}
