package Chap14;

//��帶��Ʈ ���÷��� Ŭ���� ��� ��
public class HeadMountedDisplayTester {
	public static void main(String[] args) {
		HeadMountedDisplay hmd = new HeadMountedDisplay();
		hmd.putOn(); // ����
		hmd.putOff(); // ����
		hmd.changeSkin(Skinnable.YELLOW); // ��Ų ����
		hmd.putSkin(); // ��Ų ǥ��
		Wearable w = hmd;
		w.putOn(); // ����
		w.putOff(); // ����
		Skinnable s = hmd;
		s.changeSkin(Skinnable.BLACK); // ��Ų ����
		hmd.putSkin(); // ��Ų ǥ��
	}
}
