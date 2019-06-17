package Chap13;

/**
 * Rectangle Ŭ������ �簢���� ��Ÿ���� Ŭ�����̴�. �� Ŭ������ ������ ���´� �߻� Ŭ���� Shape���� �Ļ��� Ŭ�����̴�.
 * 
 * @author �ù�Ÿ
 * @see Shape
 */
public class Rectangle extends Shape {
	/**
	 * �簢���� �ʺ� ��Ÿ���� int�� �ʵ��̴�.
	 */
	private int width;
	/**
	 * �簢���� ���̸� ��Ÿ���� int�� �ʵ��̴�.
	 */
	private int height;

	/**
	 * �簢���� �����ϴ� �������̴�. �ʺ�� ���̸� �μ��� �޴´�.
	 * 
	 * @param width  �簢���� �ʺ�
	 * @param height �簢���� ����
	 */
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	/**
	 * toString �޼����� �簢���� ���õ� ���� ������ ���ڿ��� ��ȯ�Ѵ�.
	 * 
	 * @return ���ڿ�"Rectangle(width:4, height:3)"�� ��ȯ�Ѵ�. 4�� 3�κ��� ���� �ʺ�� ���� �ش��ϴ� ���̴�.
	 */
	public String toString() {
		return "Rectangle(width:" + width + ", height:" + height + ")";
	}

	/**
	 * draw �޼���� �簢���� �׸���. ��ǥ '*'�� �����ؼ� �׸���. �ʺ��� ������ŭ '*'�� ǥ���ϰ� �� �ٲ��ϴ� ���� widthȸ��ŭ
	 * �ݺ��Ѵ�.
	 */
	public void draw() {
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++)
				System.out.print('*');
			System.out.println();
		}
	}
}