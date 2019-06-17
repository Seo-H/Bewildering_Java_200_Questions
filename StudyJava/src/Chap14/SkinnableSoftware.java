package Chap14;

//���� ������ ������ ����Ʈ���� SkinnableSoftware Ŭ����
class SkinnableSoftware implements Skinnable {
	int skin; // ��Ų
//������

	public SkinnableSoftware() {
		this.skin = BLACK;
	}

	public SkinnableSoftware(int skin) {
		this.skin = skin;
	}

	public void changeSkin(int skin) {
		this.skin = skin;
	} // ��Ų ����

	public int getSkin() {
		return skin;
	} // ��Ų ��������

	public String getSkinString() { // ��Ų�� ���ڿ� ��ȯ
		switch (skin) {
		case BLACK:
			return "BLACK";
		case RED:
			return "RED";
		case GREEN:
			return "GREEN";
		case BLUE:
			return "BLUE";
		case YELLOW:
			return "YELLOW";
		}
		return "";
	}
}
