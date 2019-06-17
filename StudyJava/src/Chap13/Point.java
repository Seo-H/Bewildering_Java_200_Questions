package Chap13;

/**
 * Point Ŭ������ ���� ��Ÿ���� Ŭ�����̴�. �� Ŭ������ ������ ��Ÿ���� �߻� Ŭ���� Shape�κ��� �Ļ��� Ŭ�����̴�. �ʵ�� ����.
 * 
 * @author �ù�Ÿ
 * @see Shape
 */
public class Point extends Shape {
	/**
	 * ���� �����ϴ� �������̴�. �޴� �μ��� ����
	 */
	public Point() {
		// �ƹ��͵� ���� �ʴ´�
	}

	/**
	 * toString �޼���� ���� ���õ� ���� ������ ���ڿ��� ��ȯ�Ѵ�. ��ȯ�ϴ� ���ڿ��� �׻� "Point"�̴�.
	 * 
	 * @return ���ڿ� "Point"�� ��ȯ�Ѵ�.
	 */
	public String toString() {
		return "Point";
	}

	/**
	 * draw �޼���� ���� �׸��� �޼����̴�. �÷��� ��ȣ'+'�� 1���� ǥ���ϰ� �� �ٲ��Ѵ�
	 */
	public void draw() {
		System.out.println('+');
	}
}
