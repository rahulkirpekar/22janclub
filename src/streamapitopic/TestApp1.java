package streamapitopic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(1, "rahul", 12, 89);
		Student s2 = new Student(2, "ankur", 12, 98);
		Student s3 = new Student(3, "rakesh", 12, 65);
		Student s4 = new Student(4, "parul", 12, 76);
		Student s5 = new Student(5, "avni", 12, 45);

		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		
		Stream<Student> str = list.stream();
		
//		List<Student> topperList = str.filter(s -> s.getPer() > 80).collect(Collectors.toList());
		
		str.filter(s -> s.getPer() > 80).forEach(s->System.out.println(s.getRno() + " "+  s.getName() + " " + s.getStd()));
		
		
		  Float totalPrice = list.stream()  
                  .map(product->product.getStd())  
                  .reduce(0.0f,(sum, std)->sum+std);   // accumulating price  
		
		
		
//		for (int i = 0; i < topperList.size(); i++) 
//		{
//			topperList.get(i).disp();
//		}
//		ArrayList<Student> topperList = new ArrayList<Student>();
//		for (int i = 0; i < list.size(); i++) 
//		{
//			Student s = list.get(i);
//			if(s.getPer() > 80) 
//			{
//				topperList.add(s);
//			}
//		}
//		for (int i = 0; i < topperList.size(); i++) 
//		{
//			topperList.get(i).disp();
//		}
	}
}
