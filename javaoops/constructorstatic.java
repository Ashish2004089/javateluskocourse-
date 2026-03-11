package oopspractice;

class Date{
	
	static int age;
	static {
		age= 11;
		System.out.println("static block1");
	}
	static void display() {
		System.out.println("age is : " + age);
	}
}
public class static2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//note 1 static variable,methods are invoked using the class name directly 
		//when to use static things = for the use of utility tools static tools ,variables are used ;
		Date.display();
		
	}

}
