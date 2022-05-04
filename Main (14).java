//Sum of Two Arrays Elements in Java
//Note:-that we can’t add two arrays that are of different types or incompatible types. Both arrays should be similar types or compatible with each other.
import java.util.Scanner;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter number of Elements in first array: ");
	   int array1size=sc.nextInt();
	   System.out.println("Enter number of Elements in second array: ");
	   int array2size=sc.nextInt();
	  
	  if (array1size != array2size){
	      System.out.println("Both array must have "+
                      "same number of elements");
        return;
	  }
	   
	   int array1[]=new int[array1size];
	   int array2[]=new int[array1size];
	   int array3[]=new int[array1size];
	 
	 System.out.println("Enter first array elements: ");
	 for(int i=0;i<array1.length;i++){
	     array1[i]=sc.nextInt();
	 }
	 System.out.println("Enter second array elements: ");
	 for(int i=0;i<array2.length;i++){
	     array2[i]=sc.nextInt();
	 }
	  for (int i=0; i<array3.length; i++) {
      // add array elements
      array3[i] = array1[i] + array2[i];
    }
    System.out.println("Resultant Array: " 
        + Arrays.toString(array3));
	}
}
