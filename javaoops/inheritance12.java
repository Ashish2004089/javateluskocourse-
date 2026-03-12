package oopspractice;

interface calc{
	//by default all the method present in the interface are public and abstract
	//we can't create the object of the interface
	
	  int   add(int a,int b);  
	int mul (int a,int b);
}
class calculator10 implements calc{
	
	public int  add(int a,int b) {
		int d = a+b;
		return d;
	}
	 public int mul(int a,int b) {
		int d = a*b;
		return d;
	}
}
public class inheritance12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//in this file i ll practice the interface of java
		calculator10 c1 = new calculator10();
//		c1.add(5, 5);
		System.out.println(c1.add(5, 5));
		System.out.println(c1.mul(7,7));
	}

}
