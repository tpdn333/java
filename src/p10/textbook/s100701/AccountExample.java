package p10.textbook.s100701;

public class AccountExample {
	public static void main(String[] args) {
		Account a1 = new Account();
		
		// 예금하기
		a1.deposit(10000);
		System.out.println("예금액: " + a1.getBalance());
		
		// 출금하기
		try {
			a1.withdraw(30000);
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
		}
	}
}
