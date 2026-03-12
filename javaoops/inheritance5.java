package oopspractice;

class demo1{
	
	int a,b;
	demo1(){
		System.out.println("demo1 zero param constructor");
	}
	demo1(int a,int b){
		this.a = a;
		this.b = b;
		System.out.println("demo1 1 param constructor");
	}
	
}

class demo2 extends demo1{
	int x,y;
	
	demo2(){
		super();
		System.out.println("demo2 zero param constructor");
	}
	demo2(int x,int y){
		//yaha pr super() written hai behind the scene vo parent class 0 param constructor ko call karega then yaha pr control 
		//aayega 
		
		this.x = x;
		this.y = y;
		System.out.println("demo 2 param constructor");
		
	}
	void disp() {
		System.out.println("x "+x +" y "+y);
		System.out.println("a "+a+ " b "+b);
	}
	
}
public class inheritance5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this -> it is used to call the constructor of the current  class
		 demo2 d2 = new demo2(4,5);
		 d2.disp();
		 
	}

}


//output
demo1 zero param constructor
demo 2 param constructor
x 4 y 5
a 0 b 0

