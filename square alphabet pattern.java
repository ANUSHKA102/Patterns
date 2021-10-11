/*
Pattern 25

A B C D E  
B C D E F 
C D E F G 
D E F G H 
E F G H I

*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    for(int i=0;i<5;i++){
        int a=65;
        for(int j=0;j<5;j++){
            System.out.print((char)(a+i+j)+" ");
            
        
        }
        System.out.println();
    }
}
}







	        
