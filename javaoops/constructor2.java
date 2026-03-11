package oopspractice;

class Practice2{
	
	private String name;
	private int age;
	private int price;
	
	
	Practice2(String name){
		this.name= name;
	}
	
	Practice2(String name,int age,int price){
		this.name= name;
		this.age= age;
		this.price = price;
	}
	
	
	String getname() {
		return name;
	}
	int getage() {
		return age;
	}
	int getprice() {
		return price;
	}
	
}
public class constructor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Practice2 myself = new Practice2("ashish");
		Practice2 myself1 = new Practice2("ashish",22,10000000);
		
		System.out.println(myself.getname());
		
		
		
		System.out.println("space is given*****************************************");
		System.out.println();
		
		System.out.println(myself1.getname());
		System.out.println(myself1.getage());
		System.out.println(myself1.getprice());
		
		
		

	}

}
