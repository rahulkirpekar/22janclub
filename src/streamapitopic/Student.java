package streamapitopic;

public class Student 
{
	private int rno;
	private String name;
	private int std;
	private float per;
	
	public Student() 
	{
	}
	public Student(int rno, String name, int std, float per) 
	{
		this.rno = rno;
		this.name = name;
		this.std = std;
		this.per = per;
	}

	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	public void disp() 
	{
		System.out.println(rno + " " +name + " " + std + " " + per);
	}
	@Override
	public String toString() 
	{
		return rno + " "+ name + " " + std;
	}
}
