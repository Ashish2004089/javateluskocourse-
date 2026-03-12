package oopspractice;

class Alpha1{
	int age; 
	String coursename;
	
	void display() {
		System.out.println("this is java course");
	}
}
class Beta1 extends Alpha1{
	
	void setage(int age) {
		this.age = age;
	}
	void setcoursename(String coursename) {
		this.coursename= coursename;
	}
	
	int getage() {
		return age;
	}
	String getcoursename() {
		return coursename;
	}
}
public class inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beta1 ashish2 = new Beta1();
		ashish2.setage(17);
		ashish2.setcoursename("ias balkishan mandal ");
		System.out.println(ashish2.getage());
		System.out.println(ashish2.getcoursename());

	}

}
