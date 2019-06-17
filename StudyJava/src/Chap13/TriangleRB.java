package Chap13;

/**
 * TriangleRB Ŭ������ ���ϰ� ������ �̵ �ﰢ�� Ŭ�����̴�. �� Ŭ������ ���� �̵ �ﰢ���� ��Ÿ���� �߻� Ŭ����
 * AbstTriangle�κ��� �Ļ��� Ŭ�����̴�.
 * 
 * @author �ù�Ÿ
 * @see Shape
 * @see AbstTriangle
 */
public class TriangleRB extends AbstTriangle {
	/**
	 * ���ϰ� ������ �̵ �ﰢ���� �����Ѵ�. �� ���� ���̸� �μ��� �޴´�.
	 * 
	 * @param length ������ �̵ �ﰢ���� �� ���� ����
	 */
	public TriangleRB(int length) {
		super(length);
	}

	/**
	 * toString�� ���ϰ� ������ �ﰢ���� ������ ���ڿ��� ��ȯ�Ѵ�.
	 * 
	 * @return ���ڿ� "TriangleRB(length:3)"�� ��ȯ�Ѵ�. 3�κ��� ���̿� �ش��ϴ� ���̴�.
	 */
	public String toString() {
		return "TriangleRB(length:" + getLength() + ")";
	}

	/**
	 * draw�� ���ϰ� ������ �ﰢ���� �׸���. ��ǥ '*'�� �����ؼ� �׸���.
	 */
	public void draw() {
		for (int i = 1; i <= getLength(); i++) {
			for (int j = 1; j <= getLength() - i; j++)
				System.out.print(' ');
			for (int j = 1; j <= i; j++)
				System.out.print('*');
			System.out.println();
		}
	}
}