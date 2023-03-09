package oops.rundemo;

public class TestApp2 
{
	public void getRoiByCalc(RbiBank bank) 
	{
		if(bank instanceof AxisBank) 
		{
			AxisBank axisBank = (AxisBank)bank; 
			System.out.println("Welcome to AxisBank - " + axisBank.getRoi());
		}else if( bank instanceof SbiBank) 
		{
			SbiBank sbiBank = (SbiBank)bank; 
			System.out.println("Welcome to SBIBank - " + sbiBank.getRoi());
		}
	}
	public static void main(String[] args) 
	{
		TestApp2 t = new TestApp2();
		AxisBank axisBank = new AxisBank();
		SbiBank sbiBank = new SbiBank();
		
		t.getRoiByCalc(axisBank);
		t.getRoiByCalc(sbiBank);
		
	}
}
