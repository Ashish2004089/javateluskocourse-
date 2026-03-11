package oopspractice;

class Practice{
	private int cost;
	private String name;
	private int duration;
	
	//both the constructor and the class name must be same 
	
	/*
	 * constructor overloading = when we create the multiple constructor with the same name but the 
	 * no of parameters ,order of parameters and date type of the parameter is different then at the time of compilation 
	 * compiler will decide which constructor will get invoked 
	 * 
	 * 
	 *constructor has no return type 
	 * 
	 * 
	 * just after making the class the default constructor get automatically get created with default parameters;
	 * 
	 * 
	 */
	
	//1 parameter constructor 
	Practice(String name){
		this.name= name; 
	}
	//2 parameter constructo;
	Practice(String name,int cost){
		this.name= name;
		this.cost= cost;
	}
	
	//3 parameter constructor; 
	Practice(String name,int cost,int duration){
		this.name= name;
		this.cost = cost;
		this.duration = duration;
	}
	
	int getcost() {
		return cost;
	}
	int getduration() {
		return duration;
	}
	String getname() {
		return name;
	}
	
	
	
	
}
public class constructor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if i make the class then the 0 parameterized constructor get created directly in the background; 
		
		Practice school = new Practice("ashish",4500);
		Practice school2 = new Practice("ashish",4500,3);
		Practice school3 = new Practice("ashish");
		
		System.out.println(school.getcost());
		System.out.println(school.getname());
		
		
		
		System.out.println(school2.getcost());
		System.out.println(school2.getname());
		System.out.println(school2.getduration());
		
		
		System.out.println(school3.getname());
		
		
	}

}
