package oopspractice;

class Practice1{
	
	private int id;
	private String name;
	
	
	//this keyword is used to differentiate between the local variable and the instance variable 
	//when they both share the same name 
	//suppose like both id  is received in parameter and in instance variable it is declared also now while assigning the 
	//value if id don't use as this.id = id and use id = id this will led to ambiguity  and compiler will 
	//get confuse 
	void setid(int id) {
		this.id = id;
	}
	
	void setname(String name) {
		this.name= name;
	}
	
	int getid() {
		return id;
	}
	String getname() {
		return name;
	}
	
}
public class thiskeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Practice1 prac= new Practice1();
			
			prac.setid(19);
			prac.setname("ashish");
			
			System.out.println(prac.getid());
			System.out.println(prac.getname());
			
			
			
	}

}
