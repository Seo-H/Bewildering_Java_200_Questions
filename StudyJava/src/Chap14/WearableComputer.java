package Chap14;

//����� ��ǻ�� Ŭ���� WearableComputer
public class WearableComputer implements Wearable {
	public void putOn() {
		System.out.println("��ǻ�͸� �����߽��ϴ�.");
	}

	public void putOff() {
		System.out.println("��ǻ�͸� �����ϴ�.");
	}

	public void reset() {
		System.out.println("��ǻ�͸� ������߽��ϴ�.");
	}
}
