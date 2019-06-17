package Chap09_1;

//���� ���� Ŭ����(Ver.2)
class Account {
private String name; // ���� ����
private String no; // ���� ��ȣ
private long balance; // ���� �ܰ�
private Day openDay; // ���� ������
//--- ������ ---//
public Account(String n, String num, long z,Day d) {
name = n; // ���� ����
no = num; // ���� ��ȣ
balance = z; // ���� �ܰ�
openDay = new Day(d); // ���� ������
}
//--- ���� ���� Ȯ�� ---//
public String getName() {
return name;
}
//--- ���� ��ȣ Ȯ�� ---//
public String getNo() {
return no;
}
//--- ���� �ܰ� Ȯ�� ---//
public long getBalance() {
return balance;
}
//--- ���� ������ Ȯ�� ---// 3
public Day getOpenDay() {
return new Day(openDay);
}
//--- k�� �Ա� ---//
void deposit(long k) {
balance += k;
}
//--- k�� ��� ---//
void withdraw(long k) {
balance -= k;
}
//--- ���ڿ� ǥ���� ���� ���� �⺻ ���� ��ȯ---//
public String toString() {
return "{" + name + ", " + no + ", " + balance + "}";
}
}