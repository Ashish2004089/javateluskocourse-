package oopspractice;

final class courses{
	
	public void course() {
		System.out.println("this is java dev course");
	}
}

//as the parent class is declared is the final class then it can't be inherited to the child class noted 

class batch extends courses{
	public void course() {
		System.out.println("this is 1st class");
		
	}
}
public class inheritance9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//working of the final class and final keyword 
		
		//if we declare the class as the final class then the class will not participate in the inheritance 
		//if we declare the class methods as the final then they will participate in the inheritance but we can't 
		//override them 
		//we can't use final and abstract together
		batch b1 = new batch();
		b1.course();
	}

}
