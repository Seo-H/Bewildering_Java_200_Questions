package Chap16;

//�� �ڸ�(0~9) ���� �ϱ�
import java.util.Scanner;

//--- ���� �� ���� ---//
class RangeError extends RuntimeException {
	RangeError(int n) {
		super("���� �� ����" + n);
	}
}

//--- ���� �� ���� (�Ű� ����) ---//
class ParameterRangeError extends RangeError {
	ParameterRangeError(int n) {
		super(n);
	}
}

//--- ���� �� ����(��ȯ��) ---//
class ResultRangeError extends RangeError {
	ResultRangeError(int n) {
		super(n);
	}
}
