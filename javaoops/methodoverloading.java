package oopspractice;


class Calculation{
	
	  
	int add(int a,int b) {
		return a+b;
	}
	
	float add (float a,float b) {
		return a+b;
		
	}
	float add(int a,float b,int c) {
		return a+b+c;
	}
	
	float add(float a,int b,int c) {
		return a+b;
	}
	
}

public class methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		//method overloading == compile time polymorphism == function overloading 
		/*
		 * at the time of compilation when the name of all the methods is same,then based on the name of 
		 * parameters ,date type of the parameters, and order of the parameters compiler will resolve which 
		 *method is to be executed .
		 *This is called compile time polymorphism		 *
		 *multiple methods with same name even with same parameters but the datatype of the parameters ,
		 *order must be different 
		 *
		 *
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
//		1->>m == compile time polymorphism 
		Calculation calc1 = new Calculation();
		System.out.println(calc1.add(7, 8));
		
		System.out.println(calc1.add(2.5f,6.0f));
		
		System.out.println(calc1.add(8,7.9f,9));
		
		System.out.println(calc1.add(8.9f,6,7));
		
		
		
		
		
	}

}
