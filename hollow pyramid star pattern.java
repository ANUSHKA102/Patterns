/*
Pattern 13
Take no of rows as input then print like-
for n=5:

        *
      *   *
    *       *
  *           *
* * * * * * * * *          
  


*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		for(int i=0;i<n;i++){
		    for(int j=1;j<2*n;j++){
		        if(i==n-1 || i+j==n ||j-i==n){
		            System.out.print("*");
		        }
		        
		        else{
		            System.out.print(" ");
		        }
		    }
		    System.out.println();
		}
		
		
	}
}
