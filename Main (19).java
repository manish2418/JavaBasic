//Reversed Arrays

import java.util.Arrays;

public class Main {
  
  // main method
  public static void main(String[] args) {

    // declare and initialize arrays
    int arr[] = {50, 25, 30, 55, 15};
    System.out.println("The original array");
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
    System.out.println();
    System.out.println("Reversed array");
    for(int i=arr.length-1;i>=0;i--){
        System.out.println(arr[i] +" ");
    }
  }
}