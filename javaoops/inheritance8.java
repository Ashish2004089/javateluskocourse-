//decreasing or increasing the visibility of the mehtods present in the parent class
package oopspractice;

class animal{
	public void eat() {
		System.out.println("animal is eating");
	}
}
class tiger extends animal{
	//as the method eat is declared public in the parent class we can't decrease the visibility from parent to child class 
	//but we can increase the visibility 
//	protected void eat() {  //this is wrong //visibit
//		System.out.println("animal eat and hunts");
//		
//	}
	
	public void eat() {
		System.out.println("animal eats and hunts");
		
	}
}
public class inheritance8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// practice = inheritance and polymorphism
		tiger t1= new tiger();
		t1.eat();
	}

}

