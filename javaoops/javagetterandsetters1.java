
package oopspractice;

class Student{
	
	//instance variable ->they will only get created when the object of the class is created 
	int age;
	
	
	
	//they are called as the methods of the class
	
	//setter 
	void sleep(int time) {
		age = time;
	}

	//getter 
	int getsleep() {
		return age;
	}
}
public class oopscode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu = new Student();
		
		stu.sleep(9);
		
		System.out.println(stu.getsleep());
		
	}

}
