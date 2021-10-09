/*
Pattern 4
Take no of rows as input then print like-
for n=5:

* * * * *
  * * * *
    * * *
      * *
        *


*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	       for(int j=0;j<n;j++){
	           for(int k=0;k<n;k++){
	               if(k<j){
	                System.out.print("  ");
	                }
	                else{
	                    System.out.print("* ");
	                }
	           
	       
	}
	System.out.println();
}
}
}
