package Chap14;

//��帶��Ʈ ���÷��� Ŭ����
public class HeadMountedDisplay implements Wearable, Skinnable {
	private int skin; // ��Ų
//����

	public void putOn() {
		System.out.println("���÷��̸� �����߽��ϴ�.");
	}

//����
	public void putOff() {
		System.out.println("���÷��̸� �������ϴ١�");
	}

//��Ų ����
	public void changeSkin(int skin) {
		this.skin = skin;
	}

//���� ��Ų ǥ��
	public void putSkin() {
		switch (skin) {
		case BLACK:
			System.out.println("BLACK DISPLAY");
			break;
		case RED:
			System.out.println("RED DISPLAY");
			break;
		case GREEN:
			System.out.println("GREEN DISPLAY");
			break;
		case BLUE:
			System.out.println("BLUE DISPLAY");
			break;
		case YELLOW:
			System.out.println("YELLOW DISPLAY");
			break;
		}
	}
}