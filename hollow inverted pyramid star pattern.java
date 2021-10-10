/*
Pattern 14
Take no of rows as input then print like-
for n=5:

 
* * * * * * * * *    
  *           *
    *       *
      *   *
        *
*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int px=0;
		int py=2*n;

		for(int i=0;i<=n;i++){
		    for(int j=1;j<2*n;j++){
		        if(i==0 ||j==px ||j==py){
		            System.out.print("*");
		        }
		        
		        else{
		            System.out.print(" ");
		        }
		    }
		    System.out.println();
		    px=px+1;
		    py=py-1;
		}
		
		
	}
}
