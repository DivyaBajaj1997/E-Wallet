package Wallet.ui;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import Wallet.Entity.*;

public class CustomerMain {
	public static void main(String[] args){
		CustomerMain c = new CustomerMain();
		c.execute();
	}
		Map<String, Customer> store = new HashMap<>();
		
		public void execute() {
			Customer c1 = new Customer("9989898898","Divya",9000.35);
			store.put("9989898898", c1);
			Customer c2 = new Customer("9900898798","Riya",11000.75);
			store.put("9900898798", c2);
			Customer c3 = new Customer("9998000000","Ananya",4500.39);
			store.put("9998000000", c3);
			Customer c4 = new Customer("9977777798","Maneel",9800.00);
			store.put("9977777798", c4);
			
			System.out.println("Printing all the Customer Details");
			//Print Functionality
			print();
			
			System.out.println("\nCustomer Details based on Search by Id");
			//Searching by Id
			Customer c5 = findbyId("9900898798");
			System.out.println("[Phone No : " + c5.getPhone_no() + "] [name :  " + c5.getName() + "] [Balance :  " + c5.getBalance() + "]");
		
			System.out.println("\nTransfer amount from Account 1 to 2");
			c1.transferAmount(c4, 670);
		}
		
		public Customer findbyId(String ph_no) {
			Customer c = store.get(ph_no);
			return c;
		}
		public void print()
		{
			Set<String> keys = store.keySet();
			for(String id : keys)
			{
				Customer c = store.get(id);
				System.out.println("[Phone No : " + c.getPhone_no() + "] [name :  " + c.getName() + "] [Balance :  " + c.getBalance() + "]");
		}
	}
}
	
	


