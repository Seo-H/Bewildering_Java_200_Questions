package Chap13;

/**
 * AbstTriangle Ŭ������ ���� �̵ �ﰢ���� ��Ÿ���� �߻� Ŭ�����̴�. �� Ŭ������ ������ ��Ÿ���� �߻� Ŭ���� Shape�� ����
 * �Ļ��� Ŭ�����̴�. �߻� Ŭ�����̹Ƿ� �ν��Ͻ��� ������ �� ����. ��ü���� ���� �̵ �ﰢ�� Ŭ������ �� Ŭ�����κ��� �Ļ���Ų��.
 * 
 * @author �ù�Ÿ
 * @see Shape
 * @see TriangleLB TriangleLU TriangleRB TriangleRU
 */
public abstract class AbstTriangle extends Shape {
	/**
	 * �� ���� ���̸� ��Ÿ���� int�� �ʵ�
	 */
	private int length;

	/**
	 * ���� �̵ �ﰢ���� �����ϴ� �������̴�. �� ���� ���̸� �μ��� �޴´�.
	 * 
	 * @param length ������ �̵ �ﰢ���� �� ���� ����
	 */
	public AbstTriangle(int length) {
		setLength(length);
	}

	/**
	 * �� ���� ���̸� ��ȯ�Ѵ�
	 * 
	 * @return �� ���� ����
	 */
	public int getLength() {
		return length;
	}

	/**
	 * �� ���� ���̸� �����Ѵ�.
	 * 
	 * @param length ������ �� ���� ����
	 */
	public void setLength(int length) {
		this.length = length;
	}

	/**
	 * toString �޼���� �̵ �ﰢ���� ���õ� ������ ���ڿ��� ��ȯ�Ѵ�.
	 * 
	 * @return ���ڿ� "AbstTriangle(length:3)"�� ��ȯ�Ѵ�. 3 �κ��� �� ���� ���̿� �ش��ϴ� ���̴�.
	 */
	public String toString() {
		return "AbstTriangle(length:" + length + ")";
	}
}
