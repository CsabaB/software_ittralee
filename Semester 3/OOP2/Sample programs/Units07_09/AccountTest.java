/** demonstrates the use of a static class method */
public class AccountTest{
	public static void main (String args[]){
		Account a1 = new Account();
		a1.setName("Mary");
		a1.lodge(100);
		System.out.println("Account details before interest " + a1);
		Account.setInterestRate(2.5);
		System.out.println("\nThe interest rate on accounts is currently " +
		             Account.getInterestRate());
		a1.addInterest();
		System.out.println("\nAccount details after interest " + a1);
	}
}