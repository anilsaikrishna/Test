package classesandobjects;

public class AccountObject {
	public static void main(String[] args) {
		AccountHolder obj = new AccountHolder();
		obj.firstName = "Ajay";
		if(obj.isEligible()) {
			System.out.println(" Is Eligible : " + true);
		} else {
			System.out.println("Is Eligible : " + false);
		}
	}
}
