package oops.folmetoer;

public class Vehicle 
{
	void run() 
	{
		System.out.println("Vehicle - run()");
	}
}
/* private----within class
 * default----within package
 * protected--within package + outside package must with is-A relation 
 * 
 * pack1				pack2
 * 	  A						B extends A--main()---B obj=new B();// obj.no1
 *      pro--no1			
 * 
 * public-----can access everywhere
 * 
 */
 
