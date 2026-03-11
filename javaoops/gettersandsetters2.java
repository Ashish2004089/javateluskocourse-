package oopspractice;


class Calc{
	
	int number;
	
	//setters  
	void multiply(int x,int y) {
		number =  x*y;
	}
	
	//setters  
	void add(int x,int y ,int z) {
		number = x+y+z;
	}
	
	//getters 
	int getmul() {
		return number;
	}
	//getters 
	
	int getadd() {
		return number;
	}
}
public class oopscode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to multiply 2 no's with the help of the setter 
		
		Calc op1 = new Calc();
		op1.multiply(7,9);
		System.out.println(op1.getmul());
		op1.add(9,9,8);
		System.out.println(op1.getadd());
		
		
	}

}
