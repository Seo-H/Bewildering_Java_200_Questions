package Chap14;

//��Ų ���� ������ �κ� �ֿϰ� Ŭ����
public class SkinnableRobotPet extends RobotPet implements Skinnable {
	private int skin; // ��Ų

	// ������
	public SkinnableRobotPet(String name, String masterName, int skin) {
		super(name, masterName); // ���� Ŭ������ ������
		this.skin = skin;
	}

	// ��Ų ����
	public void changeSkin(int skin) {
		this.skin = skin;
	}

	// ������ ��Ų�� ǥ��
	public void printSkin() {
		switch (skin) {
		case BLACK:
			System.out.print("����");
			break;
		case RED:
			System.out.print("����");
			break;
		case GREEN:
			System.out.print("�ʷ�");
			break;
		case BLUE:
			System.out.print("�Ķ�");
			break;
		case YELLOW:
			System.out.print("���");
			break;
		}
	}
}
