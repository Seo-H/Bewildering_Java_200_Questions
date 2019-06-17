package Chap12;

//정기 예금 은행 계좌 클래스
class TimeAccount extends Account {
	private long timeBalance; // 예금 잔액(정기예금)
//생성자

	TimeAccount(String name, String no, long balance, long timeBalance) {
		super(name, no, balance); // Acocunt 클래스의 생성자 호출
		this.timeBalance = timeBalance; // 예금 잔액(정기예금)
	}

//정기예금 잔액 확인
	long getTimeBalance() {
		return timeBalance;
	}

//정기예금을 해약하고 전액을 보통예금으로 이체
	void cancel() {
		deposit(timeBalance);
		timeBalance = 0;
	}
}