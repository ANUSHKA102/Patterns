/*
Pattern 23

Take no of rows as input then print like-
for n=5:

A B C D E F 
A B C D E 
A B C D 
A B C 
A B 
A 
A
A B 
A B C 
A B C D 
A B C D E 
A B C D E F


*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a=65;
	    for(int i=0;i<=n;i++){
	        for(int j=0;j<=n-i;j++){
	            System.out.print((char)((a+j))+" ");
	        }
	        System.out.println();
	    }
	    for(int i=0;i<=n;i++){
	        for(int j=0;j<i+1;j++){
	            System.out.print((char)((a+j))+" ");
	        }
	        System.out.println();
	    }
}
}
