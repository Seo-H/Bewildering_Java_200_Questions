package Chap13;

/**
 * HorzLine Ŭ������ ������ ��Ÿ���� Ŭ�����̴�. �� Ŭ������ ������ ��Ÿ���� �߻� Ŭ���� AbsLine���� �Ļ��� Ŭ�����̴�.
 * 
 * @author �ùٴ�
 * @see Shape
 * @see AbstLine
 */
public class HorzLine extends AbstLine {
	/**
	 * ������ �����ϴ� �������̴�. ���̸� �μ��� �޴´�.
	 * 
	 * @param length ������ ������ ����
	 */
	public HorzLine(int length) {
		super(length);
	}

	/**
	 * toString �޼���� ���򼱿� ���õ� ���� ������ ���ڿ��� ��ȯ�Ѵ�.
	 * 
	 * @return ���ڿ� "HorzLine(length:3)"�� ��ȯ�Ѵ�.\ 3�κ��� ���̿� �ش��ϴ� ���̴�.
	 */
	public String toString() {
		return "HorzLine(length:" + getLength() + ")";
	}

	/**
	 * draw �޼���� ������ �׸���. ���̳ʽ� ��ȣ '-'�� ������ �����ؼ� �׸���. ������ ������ŭ '-'�� �������� ǥ���� �� ��
	 * �ٲ��Ѵ�.
	 */
	public void draw() {
		for (int i = 1; i <= getLength(); i++)
			System.out.print('-');
		System.out.println();
	}
}