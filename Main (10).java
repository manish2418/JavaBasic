//Java Program To Calculate The Sum Of Array Elements By Taking Input Values
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int arr[]=null;
	   System.out.println("Enter no of element");
	   int length=sc.nextInt();
	   
	   arr=new int[length];
	   
	    System.out.println("Enter element");
	    for(int i=0;i<arr.length;i++){
	        arr[i]=sc.nextInt();
	    }
	   int sum=0;
	   for(int i=0;i<arr.length;i++){
	       sum+=arr[i];
	   }
	    
		System.out.println(sum);
	}
}
