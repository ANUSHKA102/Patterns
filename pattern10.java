/*
Pattern 10
Take no of rows as input then print like-
for n=5:


     *
    ***
   *****
  *******
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
	    int px=n;
	    int py=n;
	    for(int i=0;i<n;i++){
	        for(int j=1;j<2*n;j++){
	            if(j>=px && j<=py){
	                System.out.print("* ");
	            }
	            else{
	                 System.out.print("  ");
	            }
	            
	        }
	        System.out.println();
	        px=px-1;
	        py=py+1;
	    }
	    px=0;
	    py=2*n-2;
	    for(int i=0;i<n;i++){
	        for(int j=0;j<2*n-1;j++){
	            if(j>=px && j<=py ){
	                System.out.print("* ");
	            }
	            else{
	                 System.out.print("  ");
	            }
	            
	        }
	        
	        py=py-1;
	        px=px+1;
	        System.out.println();
	       
	    }
	}
}