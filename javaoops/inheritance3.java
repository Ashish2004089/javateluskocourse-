package oopspractice;
//mulit level inheritance 

class Ashish1{
	int age;
	String name;
	String education;
	int height;
}
class Ashishchild1 extends Ashish1{
	
	void setage(int age) {
		this.age= age;
	}
	void setname(String name) {
		this.name= name;
	}
	void seteducation(String education) {
		this.education= education;
	}
	void setheight(int height) {
		this.height= height;
	}
	
	int getage() {
		return age;
	}
	String getname() {
		return name;
	}
	
	String geteducation() {
		return education;
	}
	int getheight() {
		return height;
	}
}

class Ashish3 extends Ashishchild1{
	/*
	 * logic and explaination once i extend the one class to another class if all the methods ,variable of the parent class
	 * are public then they directly get copied to the child class and we can invoke them using the child class object; 
	 * 
	 * 
	 */
	
}
public class inheritance3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Ashish3 ashishpractice= new Ashish3();
			ashishpractice.setage(17);
			ashishpractice.setname("ashish");
			ashishpractice.seteducation("btech");
			ashishpractice.setheight(176);
			System.out.println(ashishpractice.getage());
			System.out.println(ashishpractice.getname());
			System.out.println(ashishpractice.geteducation());
			System.out.println(ashishpractice.getheight());
	}

}
