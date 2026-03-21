package arraystringpractice;

public class String4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("telusko");
		String str2 = new String("telusko");
		
		System.out.println(str1==str2);
		
		//in this case the ans is false as in this case the object is directly created in the heap and 2 diff 
		
		//objects are created so it will direclty compares the references of the 2 object and as the references of the 
		//two objects are diff so the output is false
		
	}

}
