package arraystringpractice;

public class String5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder strr1= new StringBuilder("ashish");
		StringBuilder strr2 = new StringBuilder("ashish");
		System.out.println(strr1==strr2);
		System.out.println(strr1.equals(strr2));
		System.out.println(strr1.compareTo(strr2));  
//		System.out.println(strr1.equalsIgnoreCase(strr2));  //this method is not present in the string builder 
		
	}

}
