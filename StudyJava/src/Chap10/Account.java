package Chap10;

//���� ���� Ŭ����(Ver.3)
class Account {
	private static int counter = 0; // �� ������ �ĺ� ��ȣ�� �ο��ߴ°�
	private String name; // ���� ����
	private String no; // ���� ��ȣ
	private long balance; // ���� �ܰ�
	private Day openDay; // ���� ������
	private int id; // �ĺ� ��ȣ
	// �ν��Ͻ� �ʱ�ȭ ���
	{
		id = ++counter; // �ĺ� ��ȣ
		System.out.println("���� ���¸� �������ּż� �����մϴ�.");
	}

	// --- ������ (���ݾ��� 0�̰� ���� �������� ����) ---//
	public Account(String name, String no) {
		this(name, no, 0, new Day());
	}

	// --- ������ ---//
	public Account(String name, String no, long balance, Day openDay) {
		this.name = name; // ���� ����
		this.no = no; // ���� ��ȣ
		this.balance = balance; // ���� �ܰ�
		this.openDay = new Day(openDay); // ���� ������
	}

	// --- ���� ���� Ȯ�� ---//
	public String getName() {
		return name;
	}

	// --- ���� ��ȣ Ȯ�� ---//
	public String getNo() {
		return no;
	}

	// --- ���� �ܰ� Ȯ�� ---//
	public long getBalance() {
		return balance;
	}

	// --- �ĺ� ��ȣ �������� ---//
	public int getId() {
		return id;
	}

	// --- ���� ������ Ȯ�� ---//
	public Day getOpenDay() {
		return new Day(openDay);
	}

	// --- k�� �Ա� ---//
	void deposit(long k) {
		balance += k;
	}

	// --- k�� ��� ---//
	void withdraw(long k) {
		balance -= k;
	}

	// --- ���ڿ� ǥ���� ���� ���� �⺻ ���� ��ȯ---//
	public String toString() {
		return "{" + name + ", " + no + ", " + balance + "}";
	}
}
