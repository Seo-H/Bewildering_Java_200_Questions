package Chap14;

//����� Ŭ���� Headphone
public class Headphone implements Wearable {
	int volume = 0; // ����

	public void putOn() {
		System.out.println("������� �����߽��ϴ�.");
	}

	public void putOff() {
		System.out.println("������� �������ϴ�.");
	}

	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println("������ " + volume + "�� �����߽��ϴ�.");
	}
}
