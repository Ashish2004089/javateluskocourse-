package oopspractice;

class fruits{
	
	final  void show() {
		System.out.println("this is the king of the fruits");
	}
}

class mango extends fruits{
	
	final void show() {  //as the parent class method is final we can't override them in the child class
		
		System.out.println("this is new mango");
	}
}
public class inheritance10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			//final methods of the class is inherited but we can't override them 
		mango m2 = new mango();
		m2.show();
	}

}
