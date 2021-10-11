/*
Take no of rows as input then print like-
for n=5:

A 
B B 
C C C 
D D D D 
E E E E E


*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a=65;
	    for(int i=0;i<n;i++){
	        for(int j=0;j<=i;j++){
	            System.out.print((char)(a+i)+" ");
	        }
	        System.out.println();
	    }
}
}