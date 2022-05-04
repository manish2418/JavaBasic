//Compare Two Arrays in Java Using Arrays.equals()
//The equals() method of the Arrays class compare arrays based on their content or values. The Arrays.equal() method return true if the two specified arrays are equal with each other.
import java.util.Scanner;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    int arr1[]={10,20,30,40,50};
	    int arr2[] = arr1;
        int arr3[] = {10,20,30,40,50};
        int arr4[] = {15,25,35,45,55};
        
        if (Arrays.equals(arr1,arr2))
        System.out.println("arr1 & arr2 are same");
    else 
      System.out.println("arr1 & arr2 are not same");
      if(Arrays.equals(arr1, arr3))
      System.out.println("arr1 & arr3 are same");
    else 
      System.out.println("arr1 & arr3 are not same");
      if(Arrays.equals(arr1, arr4))
      System.out.println("arr1 & arr4 are same");
    else 
      System.out.println("arr1 & arr4 are not same");
	}
}
