/*
Pattern 9
Take no of rows as input then print like-
for n=5:


 *********
  *******
   *****
    ***
     *

*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int n=sc.nextInt();
	    int px=0;
	    int py=2*n-2;
	    for(int i=0;i<n;i++){
	        for(int j=0;j<2*n-1;j++){
	            if(j>=px && j<=py ){
	                System.out.print("*");
	            }
	            else{
	                 System.out.print(" ");
	            }
	            
	        }
	        
	        py=py-1;
	        px=px+1;
	        System.out.println();
	       
	    }
	}
}
