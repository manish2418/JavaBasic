//Program to Find Average in Java Using Array
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int arr[]={10,20,30};
	   int sum=0;
	   for (int i=0;i<arr.length;i++){
	       sum+=arr[i];
	   }
	   int avg=sum/3;
	   System.out.println(avg);
	}
}
