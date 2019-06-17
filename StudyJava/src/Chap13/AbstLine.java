package Chap13;

/**
 * AbstLine Ŭ������ ������ ��Ÿ���� �߻� Ŭ�����̴�. �� Ŭ������ ������ ��Ÿ���� �߻� Ŭ���� Shape�κ��� �Ļ��Ǵ� Ŭ�����̴�.
 * �߻� Ŭ�����̹Ƿ� �� Ŭ������ �ν��Ͻ��� ������ �� ����. ��ü���� ���� Ŭ������ �� Ŭ������ ���� �Ļ��ȴ�.
 * 
 * @author �ù�Ÿ
 * @see Shape
 * @see HorzLine VertLine
 */
public abstract class AbstLine extends Shape {
	/**
	 * ������ ���̸� ��Ÿ���� int�� �ʵ�
	 */
	private int length;

	/**
	 * ������ �����ϴ� �������̴�. ���̸� �μ��� �޴´�.
	 * 
	 * @param length ������ ������ ����
	 */
	public AbstLine(int length) {
		setLength(length);
	}

	/**
	 * ������ ���̸� ��ȯ�Ѵ�.
	 * 
	 * @return ������ ����
	 */
	public int getLength() {
		return length;
	}

	/**
	 * ������ ���̸� �����Ѵ�.
	 * 
	 * @param length ������ ������ ����
	 */
	public void setLength(int length) {
		this.length = length;
	}

	/**
	 * toString �޼����� ������ ���õ� ���� ������ ���ڿ��� ��ȯ�Ѵ�.
	 * 
	 * @return ���ڿ� "AbstLine(length:3)"�� ��ȯ�Ѵ�. 3 �κ��� ���̿� �ش��ϴ� ���̴�.
	 */
	public String toString() {
		return "AbstLine(length:" + length + ")";
	}
}
