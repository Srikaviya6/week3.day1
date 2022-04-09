package week3.day1;

public class AxisBank extends BankInfo {
	
	public void deposit()
	{
		System.out.println("Axis bank deposit acc");
	}

	public static void main(String[] args) {
	 BankInfo details = new AxisBank();
	 details.deposit();
	 details.saving();
	 details.fixed();
	}
}
