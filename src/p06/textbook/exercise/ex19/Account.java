package p06.textbook.exercise.ex19;

public class Account {
	private int balance;
	private static final int MIN_BALANCE = 0;
	private static final int MAX_BALANCE = 1000000;
	public void setBalance(int i) {
		if (i >= MIN_BALANCE && i <= MAX_BALANCE) {
			this.balance = i;	
		}
	}

	public int getBalance() {
		return this.balance;

	}

}
