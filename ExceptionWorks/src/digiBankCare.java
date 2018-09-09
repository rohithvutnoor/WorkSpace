
public class digiBankCare implements AutoCloseable{

	int balance;

	void withdrawl(int amt) throws withdrawlLimitException {
		if (amt > this.balance)
			throw new withdrawlLimitException("Withdrawl Amount Limit Exceeded", 420);
		this.balance -= amt;
		System.out.println("Amount Withdrawn: " + amt + " Final Balance: " + this.balance);
	}

	public static void main(String[] args) throws Exception {

		
		try (digiBankCare digi = new digiBankCare();){
			
			digi.withdrawl(1500);
			
		} catch (withdrawlLimitException e) {
			System.out.println(e+" | StatusCode: "+e.statusCode);
		}

	}

	@Override
	public void close() throws Exception {
		System.out.println("Object Closed");
	}

}
