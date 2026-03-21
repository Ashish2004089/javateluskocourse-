package arraystringpractice;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//practicing the code for matrix 
		int marks[]= new int[5];//allocating the matrix of size 5 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Kindly enter your marks");
		for(int i=0;i<5;i++) {
			
			marks[i]= scan.nextInt();
		}
			
		System.out.println("printing marks");
		
			for(int i=0;i<5;i++) {
				System.out.println(marks[i]);
			}
			scan.close(); //it must ensure the closing of the resource that is used 
	}

}
