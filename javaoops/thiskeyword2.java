package oopspractice;

class Course {
	
	private int price;
	
	private String course; 
	
	
	void setprice(int price ) {
		this.price = price;
	}
	
	void setcoursename(String course) {
		this.course = course;
	}
	
	int getprice() {
		return price;
	}
	
	String getname() {
		return course;
	}
	
}
public class thiskeyword2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Course school = new Course();
		school.setcoursename("pcm");
		school.setprice(15000);
		
		
		Course school2 = new Course();
		school2.setcoursename("pcb");
		school2.setprice(6000);
		
		System.out.println(school.getname());
		System.out.println(school.getprice());
		System.out.println("********************************");
		
		System.out.println(school2.getprice());
		System.out.println(school2.getname());

	}

}
