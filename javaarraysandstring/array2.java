package arraystringpractice;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int vec[][]= new int[2][2];    //creating the 2d matrix
			Scanner scan = new Scanner(System.in);
			for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) {
//					Object scan;
//					System.out.println("enter elements ");
					vec[i][j]= scan.nextInt();
					
				}
				
			}
			System.out.println("printing the output");
			
			for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) {
					System.out.print(vec[i][j]+" ");
					
				}
				System.out.println();
			}
			scan.close();
			
	}

}
