package Chap10;

//�Ϸ� ��ȣ Ŭ����(Ver.1)
class Id {
	static int counter = 0; // �� ������ �ĺ� �ο��� �ο��ߴ°�
	private int id; // �ĺ� ��ȣ

	// --- ������ ---//
	public Id() {
		id = ++counter; // �ĺ� ��ȣ
	}

	// --- �ĺ� ��ȣ �������� ---//
	public int getId() {
		return id;
	}
}

