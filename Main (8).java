import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    // create Scanner class object to read input
    Scanner scan = new Scanner(System.in);
    
    // declare an array variable of int type
    int arr[] = null;
    
    // ask the length
    System.out.print("Enter array length: ");
    int length = scan.nextInt();
    
    // assign size to the array
    arr = new int[length];
    
    // take input values
    System.out.println("Enter array elements: ");
    for(int i=0; i<arr.length; i++) {
      arr[i] = scan.nextInt();
    }
    
    // display the array using for loop
    System.out.println("The Entered array: ");
    for(int i=0; i<arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}