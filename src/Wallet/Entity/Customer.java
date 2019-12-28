package Wallet.Entity;

public class Customer {
	private String phone_no;
	private String name;
	private double balance;
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public Customer() {}
	public Customer(String phone_no, String name, double balance) {
		super();
		this.phone_no = phone_no;
		this.name = name;
		this.balance = balance;
	}
	
	public double addAmount(double amt)
	{
		this.balance +=amt;
		return balance;	
	}
	public double deductAmount(double amt)
	{
		this.balance -=amt;
		return balance;	
	}
	
	public int transferAmount(Customer a, double amt)
	{
		if(amt<=this.getBalance())
		{
			this.deductAmount(amt);
			a.addAmount(amt);
			System.out.println("The transfer is Successful.\n The amount left in Account 1 :" + this.getBalance() +
					"and the amount left in Account 2 : " + a.getBalance());
		}
		else
			 System.out.println("The transfer is not successful due to less balance in Account 1");
		
		return 1;
	}

}
