//Program to Find Average in Java Using Array
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   double arr[]={10,20,30};
	   double sum=0.0;
	   for (int i=0;i<arr.length;i++){
	       sum+=arr[i];
	   }
	   double avg=sum/arr.length;
	   System.out.println(avg);
	}
}
