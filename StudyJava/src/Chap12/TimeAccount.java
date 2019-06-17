package Chap12;

//���� ���� ���� ���� Ŭ����
class TimeAccount extends Account {
	private long timeBalance; // ���� �ܾ�(���⿹��)
//������

	TimeAccount(String name, String no, long balance, long timeBalance) {
		super(name, no, balance); // Acocunt Ŭ������ ������ ȣ��
		this.timeBalance = timeBalance; // ���� �ܾ�(���⿹��)
	}

//���⿹�� �ܾ� Ȯ��
	long getTimeBalance() {
		return timeBalance;
	}

//���⿹���� �ؾ��ϰ� ������ ���뿹������ ��ü
	void cancel() {
		deposit(timeBalance);
		timeBalance = 0;
	}
}