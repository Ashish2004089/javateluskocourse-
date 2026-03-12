package oopspractice;

class Alpha{
	
	 public int age;
	void display() {
		System.out.println("this is live springboot course");
	}
	
}

class Beta extends Alpha{ // alpha is parent /super/base class
	
	/*
	 * once i extend the class alpha to class beta then all the public methods and variable of the alpha class get the copy 
	 * in the beta class but i can't see them ; 
	 * 
	 * 
	 */
	int  getage() {
		age = 17;
		return age;
	}
	
}
public class inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Beta ashish1 = new Beta();
		System.out.println(ashish1.getage());
		
		
	}

}
