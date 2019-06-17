package Chap13;

/**
 * Human(Ver.5) Ŭ������ �ΰ� Ŭ�����̴�.
 * 
 * @author �ù�Ÿ
 */
public class Human {
	/** �̸��� ��Ÿ���� String�� �ʵ� */
	private String name;
	/** ������ ��Ÿ���� int�� �ʵ� */
	private int height;
	/** ü���� ��Ÿ���� int�� �ʵ� */
	private int weight;
	/** ������ ��Ÿ���� Day�� �ʵ� */
	private Day birthday;

	/**
	 * ��� Ŭ���� Human�� ������
	 * 
	 * @param name     �̸� ���ڿ�
	 * @param height   ���� ����
	 * @param weight   ü�� ����
	 * @param birthday ���� ��¥
	 */
	public Human(String name, int height, int weight, Day birthday) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.birthday = new Day(birthday);
	}

	/**
	 * �̸��� Ȯ���Ѵ�
	 */
	public String getName() {
		return name;
	}

	/**
	 * ������ Ȯ���Ѵ�
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * ü���� Ȯ���Ѵ�
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * ������ Ȯ���Ѵ�
	 */
	public Day getBirthDay() {
		return new Day(birthday);
	}

	/**
	 * ���� ���. �μ��� ������ ����ŭ ü���� �����Ѵ�.
	 * 
	 * @param w
	 */
	public void gainWeight(int w) {
		weight += w;
	}

	/**
	 * ���� ������. �μ��� ������ ����ŭ ü���� �����Ѵ�.
	 * 
	 * @param w
	 */
	public void reduceWeight(int w) {
		weight -= w;
	}

	/**
	 * �̸�, ����, ü���� ǥ���Ѵ�.
	 */
	public void putData() {
		System.out.println("�̸�:" + name);
		System.out.println("����:" + height + "cm");
		System.out.println("ü��:" + weight + "kg");
	}

/**
* ���ڿ� ǥ���� ��ȯ�Ѵ�.
*/
public String toString() {
return "{" + name + ": " + height + "cm " + weight + "kg " + birthday + "���}";
}}