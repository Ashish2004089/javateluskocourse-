package arraystringpractice;

class Ashishji{
	//this will receive the variable arguments without accepting the arguments
  
	public int add(int ... a) {
		int sum=0;
		for(int data : a) {
			sum+=data;
		}
		return sum;
	}
}
public class String8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//practice of the var args //variable arguments
		
		Ashishji temp = new Ashishji();
		int data = temp.add(7,7,7,7,7,7,7);
	 System.out.println(data);
		
		

	}

}
