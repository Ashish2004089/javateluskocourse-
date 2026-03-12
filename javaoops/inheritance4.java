package oopspractice;
class child1 {
	int age;
	String name;
	
	void setage(int age) {
		this.age= age;
	}
	void setname(String name) {
		this.name = name;
	}
	int getage() {
		return age;
	}
	String getname() {
		return name;
	}
	
	
	void eyecolor() {
		System.out.println("the eye color is black");
	}
}
class child2 extends child1 {
	
	//overriding the method 
	void eyecolor() {
		System.out.println("the eye color is blue");
	}
	
	//writing the specialized method
	void smoke() {
		System.out.println("shirish smokes 3 times a day");
	}
	
}

public class inheritance4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		//in this code i will write the code for overriding and specialized method 
		/*
		 * Diamond problem = multiple inheritance it will led to ambiguity 
		 * for example if the one child class try to extends the methods for 2 parents class this will led to 
		 * ambiguity as one class can't have the 2 parents 
		 * 
		 * 
		 * as the child inherits the height,color of the eye , nose and various other features from the parent 
		 * similary the child class also inherits the feature from the parent 
		 * 
		 * special methods  = extra things which child learn by themselve led to special methods as they are not present in 
		 * parent methods 
		 * like swimming ,smoking 
		 * 
		 * 
		 * override methods the child inherits the eyes from the parent but if the child uses the blue lens then 
		 * this is called as overriding of the method present in the parent

		 */

		child1 temp1 = new child2();
		temp1.setage(17);
		temp1.setname("ashish");
		System.out.println(temp1.getage());
		System.out.println(temp1.getname());
		temp1.eyecolor();
		
		//specalized method can be inkoked using the child class reference // this is also called as downcasting 
		((child2)temp1).smoke();
	}

}
