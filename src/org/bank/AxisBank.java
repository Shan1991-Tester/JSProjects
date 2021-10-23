package org.bank;

public class AxisBank extends BankInfo {
	@Override
	public void deposit(long amount) {
		System.out.println("Amount deposited is "+amount);
	}
	public static void main(String[] args) {
		AxisBank o=new AxisBank();
		o.deposit(6789l);
		o.saving(432);
		o.fixed(678.5f);
	}
	
	
}



