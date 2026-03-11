package oopspractice;

class Calculationmul{
	
	double mul(int a,int b) {
		return a*b;
	}
	double mul(double a,double b) {
		return a*b;
	}
	

	
	double mul(int a,double b) {
		return a*b;
	}
	double mul(double a,int b) {
		return a*b;
	}
}

public class methodoverloadingadv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculationmul temp1  = new Calculationmul();
		System.out.println(temp1.mul(7,7));
		System.out.println(temp1.mul(7.15f,7.51f));
		System.out.println(temp1.mul(5,7.1f));
		System.out.println(temp1.mul(7.1f, 5));
		
		

	}

}
