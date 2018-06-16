package classesandobjects;

public class AccountHolder {

	String firstName;
	String secondName;
	int cost;
	
	public boolean isEligible()
	{
		if(!firstName.equals("Anil")) return true;
		return false;
	}
	
};
