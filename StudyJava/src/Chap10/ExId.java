package Chap10;

//�Ϸ� ��ȣ Ŭ����(����ġ�� ������ �� �ִ�)
class ExId {
	static int counter = 0; // �� ������ �ĺ� �ο��� �ο��ߴ°�
	private static int step = 1; // ����ġ
	private int id; // �ĺ� ��ȣ

	// --- ������ ---//
	public ExId() {
		id = counter += step; // �ĺ� ��ȣ
	}

	// --- �ĺ� ��ȣ �������� ---//
	public int getId() {
		return id;
	}

	// --- ����ġ �������� ---//
	public static int getStep() {
		return step;
	}

	// --- ����ġ ���� ---//
	public static int setStep(int s) {
		step = (s >= 1) ? s : 1;
		return step;
	}

	// --- �������� �ο��� �ĺ� ��ȣ �������� ---//
	public static int getMaxId() {
		return counter;
	}
}
