package oops;

public class Address 
{
	String bno,streename,areaname,cityname,statename ,countryname,pin,contact1,contact2;
	public Address() 
	{
	}
	public Address(String bno, String streename, String areaname, String cityname, String statename, String countryname,
			String pin, String contact1, String contact2) {
		this.bno = bno;
		this.streename = streename;
		this.areaname = areaname;
		this.cityname = cityname;
		this.statename = statename;
		this.countryname = countryname;
		this.pin = pin;
		this.contact1 = contact1;
		this.contact2 = contact2;
	}
	void disp() 
	{
		System.out.println( bno + " " + streename + " " + areaname + " " +cityname + " " + statename + " " + countryname + " " + pin + " " + contact1 + " " + contact2);
	}
}
