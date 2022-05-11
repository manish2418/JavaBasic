//Two sum brute force code 

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int arr[]=null;
	    System.out.println("Enter Target");
	    int target=sc.nextInt();
	    System.out.println("Enter no of element");
	    int length=sc.nextInt();
	    arr=new int[length];
	    System.out.println("Enter element");
	    for(int i=0;i<arr.length;i++){
	        arr[i]=sc.nextInt();
	    }
		for(int i=0;i<arr.length-1;i++){
		    for(int j=0;j<arr.length-1;j++)
		
		if(target==arr[i]+arr[j]){
		    System.out.println("yes");
		}
	
		
		}
	}
}
	

