/*
Pattern 24

Take no of rows as input then print like-
for n=5:

A 
B G
C H M
D I N S 
E J O T Y
F K P U Z _


"_" is underscore,considered in this pattern
*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    for(int i=0;i<=5;i++){
        int a=65;
        int t=i;
        for(int j=i;j>=0;j--){
            System.out.print((char)(a+t)+" ");
            t=t+5;
        
        }
        System.out.println();
    }
}
}







	        
