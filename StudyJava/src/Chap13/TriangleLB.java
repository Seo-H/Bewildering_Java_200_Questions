package Chap13;

/**
 * TriangleLB Ŭ������ ���ϰ� ������ �̵ �ﰢ�� Ŭ�����̴�. 
 * �� Ŭ������ ���� �̵ �ﰢ���� ��Ÿ���� �߻� Ŭ�����̴�.
 * AbstTriangle�κ��� �Ļ��� Ŭ�����̴�.
 * 
 * @author �ù�Ÿ
 * @see Shape
 * @see AbstTriangle
 */
public class TriangleLB extends AbstTriangle {
	/**
	 * ���ϰ� ������ �̵ �ﰢ���� �����Ѵ�. �� ���� ���̸� �μ��� �޴´�.
	 * 
	 * @param length ������ �̵ �ﰢ���� �� ���� ����
	 */
	public TriangleLB(int length) {
		super(length);
	}

	/**
	 * toString�� ���ϰ� ������ �ﰢ���� ������ ���ڿ��� ��ȯ�Ѵ�.
	 * 
	 * @return ���ڿ� "TriangleLB(length:3)"�� ��ȯ�Ѵ�. 3�κ��� ���̿� �ش��ϴ� ���̴�.
	 */
	public String toString() {
		return "TriangleLB(length:" + getLength() + ")";
	}

	/**
	 * draw�� ���ϰ� ������ �ﰢ���� �׸���. ��ǥ '*'�� �����ؼ� �׸���.
	 */
	public void draw() {
		for (int i = 1; i <= getLength(); i++) {
			for (int j = 1; j <= i; j++)
				System.out.print('*');
			System.out.println();
		}
	}
}