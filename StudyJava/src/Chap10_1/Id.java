package Chap10_1;

//�Ϸ� ��ȣ Ŭ���� (Ver.2)
class Id {
	private static int counter = 0; // �� ������ �ĺ� �ο��� �ο��ߴ°�
	private int id; // �ĺ� ��ȣ

	// --- ������ ---//
	public Id() {
		id = ++counter; // �ĺ� ��ȣ
	}

	// --- �ĺ� ��ȣ �������� ---//
	public int getId() {
		return id;
	}

	// --- �������� �ο��� �ĺ� ��ȣ �������� ---//
	public static int getMaxId() {
		return counter;
	}
}
