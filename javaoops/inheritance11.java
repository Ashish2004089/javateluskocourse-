package oopspractice;

class animals{
	static int age;
	static String name;
	static void disp() {
		System.out.println("this is parent static");
	}
	
}
class dog extends animals{
	
	static void disp() {
		System.out.println("this is child static");
	}
}

public class inheritance11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static + inheritance 
		//static variable participate in inheritance and you can modify them 
		// static methods also gets inherited 
		//when we override the static methods in a child class it become a specialized methods by hiding the inherited method
		//and we get the child method output;
		animals d2 = new dog();
		d2.disp();

	}

}
