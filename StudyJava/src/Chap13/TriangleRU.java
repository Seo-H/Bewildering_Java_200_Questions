package Chap13;

/**
 * TriangleRU Ŭ������ ����� ������ �̵ �ﰢ�� Ŭ�����̴�. �� Ŭ������ ���� �̵ �ﰢ���� ��Ÿ���� �߻� Ŭ����
 * AbstTriangle�κ��� �Ļ��� Ŭ�����̴�.
 * 
 * @author �ù�Ÿ
 * @see Shape
 * @see AbstTriangle
 */
public class TriangleRU extends AbstTriangle {
	/**
	 * ����� ������ �̵ �ﰢ���� �����Ѵ�. �� ���� ���̸� �μ��� �޴´�.
	 * 
	 * @param length ������ �̵ �ﰢ���� �� ���� ����
	 */
	public TriangleRU(int length) {
		super(length);
	}

	/**
	 * toString�� ����� ������ �ﰢ���� ������ ���ڿ��� ��ȯ�Ѵ�.
	 * 
	 * @return ���ڿ� "TriangleRU(length:3)"�� ��ȯ�Ѵ�. 3�κ��� ���̿� �ش��ϴ� ���̴�.
	 */
	public String toString() {
		return "TriangleRU(length:" + getLength() + ")";
	}

	/**
	 * draw�� ����� ������ �ﰢ���� �׸���. ��ǥ '*'�� �����ؼ� �׸���.
	 */
	public void draw() {
		for (int i = getLength(); i >= 1; i--) {
			for (int j = 1; j <= getLength() - i; j++)
				System.out.print(' ');
			for (int j = 1; j <= i; j++)
				System.out.print('*');
			System.out.println();
		}
	}
}
