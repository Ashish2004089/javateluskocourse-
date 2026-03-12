package oopspractice;
class demo3{
	
	int a,b;
	demo3(){
		this(7,8);
		System.out.println("demo1 zero param constructor");
	}
	demo3(int a,int b){
		this.a = a;
		this.b = b;
		System.out.println("demo1 1 param constructor");
	}
	
}

class demo4 extends demo3{
	int x,y;
	
	demo4(){
		super();
		System.out.println("demo2 zero param constructor");
	}
	demo4(int x,int y){
		//yaha pr super() written hai behind the scene vo parent class 0 param constructor ko call karega then yaha pr control 
		//aayega 
		this();
		this.x = x;
		this.y = y;
		System.out.println("demo 2 param constructor");
		
	}
	void disp() {
		System.out.println("x "+x +" y "+y);
		System.out.println("a "+a+ " b "+b);
	}
	
}
public class inheritance7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//super -> this is used to call the constructor of the parent class 
		//duty of super is to call the parent class constructor 
		//this + super using code
		
		demo4 d4 = new demo4(4,5);
		d4.disp();
		
	}

}


//output
 demo1 1 param constructor
demo1 zero param constructor
demo2 zero param constructor
demo 2 param constructor
x 4 y 5
a 7 b 8
