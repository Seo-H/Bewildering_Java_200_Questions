package Chap13;

/**
 * VertLine Ŭ������ �������� ��Ÿ���� Ŭ�����̴�. �� Ŭ������ ������ ��Ÿ���� �߻� Ŭ���� AbstLine�κ��� �Ļ��� Ŭ�����̴�.
 * 
 * @author �ù�Ÿ
 * @see Shape
 * @see AbstLine
 */
public class VertLine extends AbstLine {
	/**
	 * �������� �����ϴ� �������̴�. ���̸� �μ��� �޴´�.
	 * 
	 * @param length ������ ������ ����
	 */
	public VertLine(int length) {
		super(length);
	}

	/**
	 * toString �޼���� �������� ���õ� ������ ���ڿ��� ��ȯ�Ѵ�.
	 * 
	 * @return ���ڿ� "VertLine(length:3)"�� ��ȯ�Ѵ�. 3�κ��� ���̿� �ش��ϴ� ���̴�.
	 */
	public String toString() {
		return "VertLine(length:" + getLength() + ")";
	}

	/**
	 * draw �޼���� �������� �׸���. ���μ� ��ȣ '|'�� ���η� �����ؼ� �׸���. ������ ������ŭ '|'�� ǥ���� �� �� �ٲ��ϴ� ����
	 * �ݺ��Ѵ�.
	 */
	public void draw() {
		for (int i = 1; i <= getLength(); i++)
			System.out.println('|');
	}
}