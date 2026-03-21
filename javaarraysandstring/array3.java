package arraystringpractice;

public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str1 = "telusko";
		String str2 = "telusko";
		System.out.println(str1==str2);   //commpare references
		System.out.println(str1.equals(str2)); //compare string data by data
		System.out.println(str1.compareTo(str2)); //it compares string char by char 
		System.out.println(str1.equalsIgnoreCase(str2)); //string data by ignoring the case of the string
		

	}

}
