/*
Pattern 18
Take no of rows as input then print like-
for n=7:

7 6 5 4 3 2 1
7 6 5 4 3 2
7 6 5 4 3
7 6 5 4
7 6 5 
7 6 
7


*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<=n+1;i++){
		    for(int j=1;j<n-i+1;j++){
		        System.out.print(n-j+1+" ");
		    }
		     System.out.println();
		}
	}
}
