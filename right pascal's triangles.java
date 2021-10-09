/*
Pattern 6
Take no of rows as input then print like-
for n=5:

*
* *
* * *
* * * *
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
	    Scanner sc= new Scanner(System.in);
	    int n=sc.nextInt();
	    for(int i=0;i<=n;i++){
	        for(int j=0;j<i;j++){
	            System.out.print("* ");
	        }
	        
	        System.out.println("  ");
	    }
	    for(int i=n+1;i<=2*n;i++){
	        for(int j=2*n;j>i;j--){
	            System.out.print("* ");
	        }
	        System.out.println("  ");
	    }
		
	}
}
