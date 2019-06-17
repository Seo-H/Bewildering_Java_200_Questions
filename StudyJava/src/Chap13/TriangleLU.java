package Chap13;

/**
 * TriangleLU Ŭ������ �»��� ������ �̵ �ﰢ�� Ŭ�����̴�. �� Ŭ������ ���� �̵ �ﰢ���� ��Ÿ���� �߻� Ŭ����
 * AbstTriangle�κ��� �Ļ��� Ŭ�����̴�.
 * 
 * @author �ù�Ÿ
 * @see Shape
 * @see AbstTriangle
 */
public class TriangleLU extends AbstTriangle {
	/**
	 * �»��� ������ �̵ �ﰢ���� �����Ѵ�. �� ���� ���̸� �μ��� �޴´�.
	 * 
	 * @param length ������ �̵ �ﰢ���� �� ���� ����
	 */
	public TriangleLU(int length) {
		super(length);
	}

	/**
	 * toString�� �»��� ������ �ﰢ���� ������ ���ڿ��� ��ȯ�Ѵ�.
	 * 
	 * @return ���ڿ� "TriangleLU(length:3)"�� ��ȯ�Ѵ�. 3�κ��� ���̿� �ش��ϴ� ���̴�.
	 */
	public String toString() {
		return "TriangleLU(length:" + getLength() + ")";
	}

	/**
	 * draw�� �»��� ������ �ﰢ���� �׸���. ��ǥ '*'�� �����ؼ� �׸���.
	 */
	public void draw() {
		for (int i = getLength(); i >= 1; i--) {
			for (int j = 1; j <= i; j++)
				System.out.print('*');
			System.out.println();
		}
	}
}