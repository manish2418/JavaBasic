//JAVA BASIC
// Write a program to calculate the total salary of a person.
// The user has to enter the basic salary (an integer) and the grade (an uppercase character),
// and depending upon which the total salary is calculated as -
//     totalSalary = basic + hra + da + allow – pf
// where :
// hra   = 20% of basic
// da    = 50% of basic
// allow = 1700 if grade = ‘A’
// allow = 1500 if grade = ‘B’
// allow = 1300 if grade = ‘C' or any other character
// pf    = 11% of basic.



import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int basic = sc.nextInt();
	    char grade=sc.next().charAt(0);
	    double hra = 0.2 * basic;
	    double da = 0.5 * basic;
	    double pf = 0.11 * basic;
	    double allow;
	    if(grade=='A'){
	         allow=1700;
	    }else if (grade=='B'){
	         allow =1500;
	    }else {
	         allow=1300;
	    }
	    
	   double total = (basic+hra+da+allow)-pf;
	   
	    System.out.println(total);
	    
	    
		
	}
}

