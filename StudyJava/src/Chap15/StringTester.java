package Chap15;

//���ڿ��� null ����, �� ���ڿ�, �ٸ� String�� ������ �����ϴ� ���ڿ��� ����
class StringTester {
	public static void main(String[] args) {
		String s1 = null; // null����(�������� �ʴ´�)
		String s2 = ""; // ""�� ����
		String s3 = "ABC"; // "ABC"�� ����
		String s4 = "ABC"; // "ABC"�� ����
		String s5 = "ABC"; // "ABC"�� ����
		s5 = "XYZ";
		System.out.println("���ڿ� s1 = " + s1);
		System.out.println("���ڿ� s2 = " + s2);
		System.out.println("���ڿ� s3 = " + s3);
		System.out.println("���ڿ� s4 = " + s4);
		System.out.println("���ڿ� s5 = " + s5);
		System.out.println("s3�� s4�� ���� ���ڿ� ���ͷ��� ����" + ((s3 == s4) ? "�ϰ� �ִ�." : "�ϰ� ���� �ʴ�."));
	}
}
