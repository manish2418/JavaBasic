//Java program to calculate the average of numbers by taking inputs from end-user
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	  double arr[]=null;
	  double sum=0.0;
	  System.out.println("Enter number of element");
	  int length=sc.nextInt();
	  arr=new double[length];
	  System.out.println("Enter element");
	  for(int i=0;i<arr.length;i++){
	      arr[i]=sc.nextInt();
	  }
	  for(int i=0;i<arr.length;i++){
	      sum+=arr[i];
	  }
	  double avg=sum/length;
	  System.out.println(avg);
	}
}
