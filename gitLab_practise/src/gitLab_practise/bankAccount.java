package gitLab_practise;

public class bankAccount {

	bankAccountData data = new bankAccountData();

	bankAccount(BankAccountParameter parameterObject){
		this.data.name = parameterObject.name;
		this.data.accountNo = parameterObject.accountNo;
		this.data.balance = parameterObject.balance;
	}
	
	int deposit(int deposit) {
		data.balance = data.balance + deposit;
		return data.balance;
	}
	
	int withdraw(int withdraw) {
		data.balance = data.balance - withdraw;
		return data.balance;
	}
	
	int getBalance() {
		 return data.balance;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
