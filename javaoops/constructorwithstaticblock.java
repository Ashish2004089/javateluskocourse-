package oopspractice;


class Car{

	private String name;
	private int cost;
	private int model;
	
	/*
	 * suppose i wanted a common count variable for all the constructor and to inc count each time ,now let us
	 * suppose i forgot to increase the count in one of the constructor this will led to mistake so thats 
	 * why i created a static variable count it is common and share by all 
	 *
	 *
	 *static variable get the memory allocation in the heap memory and get memory allocated only once
	 */
	
	
	
	
	static int count; 
      {
		count++;
	}
	Car(String name){
		this.name= name;
	}
	Car(String name,int cost){
		this.name= name;
		this.cost= cost;
	}
	
	Car(String name,int cost,int model){
		this.name= name;
		this.cost = cost;
		this.model = model;
	}

	
}
public class static1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//static variable get invoked directly using the class name instead of the object name 
		
		
		
		Car c1= new Car("fortuner");
		System.out.println(Car.count);
		
		
		
		Car c2 = new Car("benz",45);
		System.out.println(Car.count);
		
		
		
		Car c3 = new Car("bmw",50,6666);
		System.out.println(Car.count);
		
		Car c4 = new Car("audi");
		System.out.println(Car.count);
		
		
		
		
	}

}
